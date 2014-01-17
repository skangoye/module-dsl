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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_IDENT", "RULE_BOOLEAN", "RULE_STRING", "RULE_ENUM_ELEMENT", "RULE_BIT", "RULE_HEX", "RULE_INT", "RULE_ID", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'module'", "'{'", "'}'", "'@'", "'strategy'", "'interface'", "'body'", "'crit'", "':'", "'datasel'", "','", "';'", "'mcdc'", "'dc'", "'cc'", "'rand'", "'eqv'", "'bv'", "'in'", "'out'", "'inout'", "'tmp'", "'cst'", "'=='", "'('", "')'", "'int'", "'real'", "'bool'", "'enum'", "'bit'", "'hex'", "'str'", "']'", "'['", "'..'", "'?'", "'if'", "'=>'", "'else'", "'loop'", "'error'", "'null'", "'='", "'or'", "'and'", "'!='", "'<'", "'<='", "'>'", "'>='", "'+'", "'-'", "'*'", "'/'", "'not'", "'.'"
    };
    public static final int T__68=68;
    public static final int RULE_BOOLEAN=5;
    public static final int T__69=69;
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
    public static final int T__71=71;
    public static final int T__33=33;
    public static final int T__72=72;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__70=70;
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:115:1: ruleMODULE_DECL returns [EObject current=null] : (otherlv_0= 'module' () ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '{' ( (lv_strategy_4_0= ruleSTRATEGY ) ) ( (lv_interface_5_0= ruleINTERFACE ) ) ( (lv_body_6_0= ruleBODY ) ) otherlv_7= '}' ) ;
    public final EObject ruleMODULE_DECL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_2_0=null;
        Token otherlv_3=null;
        Token otherlv_7=null;
        EObject lv_strategy_4_0 = null;

        EObject lv_interface_5_0 = null;

        EObject lv_body_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:118:28: ( (otherlv_0= 'module' () ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '{' ( (lv_strategy_4_0= ruleSTRATEGY ) ) ( (lv_interface_5_0= ruleINTERFACE ) ) ( (lv_body_6_0= ruleBODY ) ) otherlv_7= '}' ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:119:1: (otherlv_0= 'module' () ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '{' ( (lv_strategy_4_0= ruleSTRATEGY ) ) ( (lv_interface_5_0= ruleINTERFACE ) ) ( (lv_body_6_0= ruleBODY ) ) otherlv_7= '}' )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:119:1: (otherlv_0= 'module' () ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '{' ( (lv_strategy_4_0= ruleSTRATEGY ) ) ( (lv_interface_5_0= ruleINTERFACE ) ) ( (lv_body_6_0= ruleBODY ) ) otherlv_7= '}' )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:119:3: otherlv_0= 'module' () ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '{' ( (lv_strategy_4_0= ruleSTRATEGY ) ) ( (lv_interface_5_0= ruleINTERFACE ) ) ( (lv_body_6_0= ruleBODY ) ) otherlv_7= '}'
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
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:151:1: ( (lv_strategy_4_0= ruleSTRATEGY ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:152:1: (lv_strategy_4_0= ruleSTRATEGY )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:152:1: (lv_strategy_4_0= ruleSTRATEGY )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:153:3: lv_strategy_4_0= ruleSTRATEGY
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMODULE_DECLAccess().getStrategySTRATEGYParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSTRATEGY_in_ruleMODULE_DECL277);
            lv_strategy_4_0=ruleSTRATEGY();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMODULE_DECLRule());
              	        }
                     		set(
                     			current, 
                     			"strategy",
                      		lv_strategy_4_0, 
                      		"STRATEGY");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:169:2: ( (lv_interface_5_0= ruleINTERFACE ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:170:1: (lv_interface_5_0= ruleINTERFACE )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:170:1: (lv_interface_5_0= ruleINTERFACE )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:171:3: lv_interface_5_0= ruleINTERFACE
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMODULE_DECLAccess().getInterfaceINTERFACEParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleINTERFACE_in_ruleMODULE_DECL298);
            lv_interface_5_0=ruleINTERFACE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMODULE_DECLRule());
              	        }
                     		set(
                     			current, 
                     			"interface",
                      		lv_interface_5_0, 
                      		"INTERFACE");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:187:2: ( (lv_body_6_0= ruleBODY ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:188:1: (lv_body_6_0= ruleBODY )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:188:1: (lv_body_6_0= ruleBODY )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:189:3: lv_body_6_0= ruleBODY
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getMODULE_DECLAccess().getBodyBODYParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleBODY_in_ruleMODULE_DECL319);
            lv_body_6_0=ruleBODY();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getMODULE_DECLRule());
              	        }
                     		set(
                     			current, 
                     			"body",
                      		lv_body_6_0, 
                      		"BODY");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleMODULE_DECL331); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getMODULE_DECLAccess().getRightCurlyBracketKeyword_7());
                  
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


    // $ANTLR start "entryRuleSTRATEGY"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:217:1: entryRuleSTRATEGY returns [EObject current=null] : iv_ruleSTRATEGY= ruleSTRATEGY EOF ;
    public final EObject entryRuleSTRATEGY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSTRATEGY = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:218:2: (iv_ruleSTRATEGY= ruleSTRATEGY EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:219:2: iv_ruleSTRATEGY= ruleSTRATEGY EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSTRATEGYRule()); 
            }
            pushFollow(FOLLOW_ruleSTRATEGY_in_entryRuleSTRATEGY367);
            iv_ruleSTRATEGY=ruleSTRATEGY();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSTRATEGY; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSTRATEGY377); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSTRATEGY"


    // $ANTLR start "ruleSTRATEGY"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:226:1: ruleSTRATEGY returns [EObject current=null] : (otherlv_0= '@' otherlv_1= 'strategy' () otherlv_3= '{' ( (lv_critdecl_4_0= ruleCRITERION_DECL ) ) ( (lv_dataseldecl_5_0= ruleDATASEL_DECL ) ) otherlv_6= '}' ) ;
    public final EObject ruleSTRATEGY() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_6=null;
        EObject lv_critdecl_4_0 = null;

        EObject lv_dataseldecl_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:229:28: ( (otherlv_0= '@' otherlv_1= 'strategy' () otherlv_3= '{' ( (lv_critdecl_4_0= ruleCRITERION_DECL ) ) ( (lv_dataseldecl_5_0= ruleDATASEL_DECL ) ) otherlv_6= '}' ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:230:1: (otherlv_0= '@' otherlv_1= 'strategy' () otherlv_3= '{' ( (lv_critdecl_4_0= ruleCRITERION_DECL ) ) ( (lv_dataseldecl_5_0= ruleDATASEL_DECL ) ) otherlv_6= '}' )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:230:1: (otherlv_0= '@' otherlv_1= 'strategy' () otherlv_3= '{' ( (lv_critdecl_4_0= ruleCRITERION_DECL ) ) ( (lv_dataseldecl_5_0= ruleDATASEL_DECL ) ) otherlv_6= '}' )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:230:3: otherlv_0= '@' otherlv_1= 'strategy' () otherlv_3= '{' ( (lv_critdecl_4_0= ruleCRITERION_DECL ) ) ( (lv_dataseldecl_5_0= ruleDATASEL_DECL ) ) otherlv_6= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleSTRATEGY414); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getSTRATEGYAccess().getCommercialAtKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,20,FOLLOW_20_in_ruleSTRATEGY426); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSTRATEGYAccess().getStrategyKeyword_1());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:238:1: ()
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:239:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getSTRATEGYAccess().getSTRATEGYAction_2(),
                          current);
                  
            }

            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleSTRATEGY447); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getSTRATEGYAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:248:1: ( (lv_critdecl_4_0= ruleCRITERION_DECL ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:249:1: (lv_critdecl_4_0= ruleCRITERION_DECL )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:249:1: (lv_critdecl_4_0= ruleCRITERION_DECL )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:250:3: lv_critdecl_4_0= ruleCRITERION_DECL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSTRATEGYAccess().getCritdeclCRITERION_DECLParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCRITERION_DECL_in_ruleSTRATEGY468);
            lv_critdecl_4_0=ruleCRITERION_DECL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSTRATEGYRule());
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

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:266:2: ( (lv_dataseldecl_5_0= ruleDATASEL_DECL ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:267:1: (lv_dataseldecl_5_0= ruleDATASEL_DECL )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:267:1: (lv_dataseldecl_5_0= ruleDATASEL_DECL )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:268:3: lv_dataseldecl_5_0= ruleDATASEL_DECL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSTRATEGYAccess().getDataseldeclDATASEL_DECLParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDATASEL_DECL_in_ruleSTRATEGY489);
            lv_dataseldecl_5_0=ruleDATASEL_DECL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSTRATEGYRule());
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

            otherlv_6=(Token)match(input,18,FOLLOW_18_in_ruleSTRATEGY501); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_6, grammarAccess.getSTRATEGYAccess().getRightCurlyBracketKeyword_6());
                  
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
    // $ANTLR end "ruleSTRATEGY"


    // $ANTLR start "entryRuleINTERFACE"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:296:1: entryRuleINTERFACE returns [EObject current=null] : iv_ruleINTERFACE= ruleINTERFACE EOF ;
    public final EObject entryRuleINTERFACE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleINTERFACE = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:297:2: (iv_ruleINTERFACE= ruleINTERFACE EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:298:2: iv_ruleINTERFACE= ruleINTERFACE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getINTERFACERule()); 
            }
            pushFollow(FOLLOW_ruleINTERFACE_in_entryRuleINTERFACE537);
            iv_ruleINTERFACE=ruleINTERFACE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleINTERFACE; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleINTERFACE547); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleINTERFACE"


    // $ANTLR start "ruleINTERFACE"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:305:1: ruleINTERFACE returns [EObject current=null] : (otherlv_0= '@' otherlv_1= 'interface' () otherlv_3= '{' ( (lv_declaration_4_0= ruleVAR_CST ) )+ otherlv_5= '}' ) ;
    public final EObject ruleINTERFACE() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_declaration_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:308:28: ( (otherlv_0= '@' otherlv_1= 'interface' () otherlv_3= '{' ( (lv_declaration_4_0= ruleVAR_CST ) )+ otherlv_5= '}' ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:309:1: (otherlv_0= '@' otherlv_1= 'interface' () otherlv_3= '{' ( (lv_declaration_4_0= ruleVAR_CST ) )+ otherlv_5= '}' )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:309:1: (otherlv_0= '@' otherlv_1= 'interface' () otherlv_3= '{' ( (lv_declaration_4_0= ruleVAR_CST ) )+ otherlv_5= '}' )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:309:3: otherlv_0= '@' otherlv_1= 'interface' () otherlv_3= '{' ( (lv_declaration_4_0= ruleVAR_CST ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleINTERFACE584); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getINTERFACEAccess().getCommercialAtKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,21,FOLLOW_21_in_ruleINTERFACE596); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getINTERFACEAccess().getInterfaceKeyword_1());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:317:1: ()
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:318:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getINTERFACEAccess().getINTERFACEAction_2(),
                          current);
                  
            }

            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleINTERFACE617); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getINTERFACEAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:327:1: ( (lv_declaration_4_0= ruleVAR_CST ) )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=34 && LA2_0<=38)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:328:1: (lv_declaration_4_0= ruleVAR_CST )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:328:1: (lv_declaration_4_0= ruleVAR_CST )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:329:3: lv_declaration_4_0= ruleVAR_CST
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getINTERFACEAccess().getDeclarationVAR_CSTParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleVAR_CST_in_ruleINTERFACE638);
            	    lv_declaration_4_0=ruleVAR_CST();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getINTERFACERule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"declaration",
            	              		lv_declaration_4_0, 
            	              		"VAR_CST");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt2 >= 1 ) break loop2;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleINTERFACE651); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getINTERFACEAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleINTERFACE"


    // $ANTLR start "entryRuleBODY"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:357:1: entryRuleBODY returns [EObject current=null] : iv_ruleBODY= ruleBODY EOF ;
    public final EObject entryRuleBODY() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBODY = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:358:2: (iv_ruleBODY= ruleBODY EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:359:2: iv_ruleBODY= ruleBODY EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getBODYRule()); 
            }
            pushFollow(FOLLOW_ruleBODY_in_entryRuleBODY687);
            iv_ruleBODY=ruleBODY();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleBODY; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleBODY697); if (state.failed) return current;

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBODY"


    // $ANTLR start "ruleBODY"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:366:1: ruleBODY returns [EObject current=null] : (otherlv_0= '@' otherlv_1= 'body' () otherlv_3= '{' ( (lv_instr_4_0= ruleINSTRUCTION ) )+ otherlv_5= '}' ) ;
    public final EObject ruleBODY() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_5=null;
        EObject lv_instr_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:369:28: ( (otherlv_0= '@' otherlv_1= 'body' () otherlv_3= '{' ( (lv_instr_4_0= ruleINSTRUCTION ) )+ otherlv_5= '}' ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:370:1: (otherlv_0= '@' otherlv_1= 'body' () otherlv_3= '{' ( (lv_instr_4_0= ruleINSTRUCTION ) )+ otherlv_5= '}' )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:370:1: (otherlv_0= '@' otherlv_1= 'body' () otherlv_3= '{' ( (lv_instr_4_0= ruleINSTRUCTION ) )+ otherlv_5= '}' )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:370:3: otherlv_0= '@' otherlv_1= 'body' () otherlv_3= '{' ( (lv_instr_4_0= ruleINSTRUCTION ) )+ otherlv_5= '}'
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleBODY734); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getBODYAccess().getCommercialAtKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,22,FOLLOW_22_in_ruleBODY746); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getBODYAccess().getBodyKeyword_1());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:378:1: ()
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:379:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getBODYAccess().getBODYAction_2(),
                          current);
                  
            }

            }

            otherlv_3=(Token)match(input,17,FOLLOW_17_in_ruleBODY767); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getBODYAccess().getLeftCurlyBracketKeyword_3());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:388:1: ( (lv_instr_4_0= ruleINSTRUCTION ) )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=RULE_IDENT && LA3_0<=RULE_INT)||LA3_0==40||LA3_0==53||(LA3_0>=56 && LA3_0<=58)||LA3_0==68||LA3_0==71) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:389:1: (lv_instr_4_0= ruleINSTRUCTION )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:389:1: (lv_instr_4_0= ruleINSTRUCTION )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:390:3: lv_instr_4_0= ruleINSTRUCTION
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getBODYAccess().getInstrINSTRUCTIONParserRuleCall_4_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleINSTRUCTION_in_ruleBODY788);
            	    lv_instr_4_0=ruleINSTRUCTION();

            	    state._fsp--;
            	    if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	      	        if (current==null) {
            	      	            current = createModelElementForParent(grammarAccess.getBODYRule());
            	      	        }
            	             		add(
            	             			current, 
            	             			"instr",
            	              		lv_instr_4_0, 
            	              		"INSTRUCTION");
            	      	        afterParserOrEnumRuleCall();
            	      	    
            	    }

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
            	    if (state.backtracking>0) {state.failed=true; return current;}
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);

            otherlv_5=(Token)match(input,18,FOLLOW_18_in_ruleBODY801); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getBODYAccess().getRightCurlyBracketKeyword_5());
                  
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
    // $ANTLR end "ruleBODY"


    // $ANTLR start "entryRuleCRITERION_DECL"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:418:1: entryRuleCRITERION_DECL returns [EObject current=null] : iv_ruleCRITERION_DECL= ruleCRITERION_DECL EOF ;
    public final EObject entryRuleCRITERION_DECL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCRITERION_DECL = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:419:2: (iv_ruleCRITERION_DECL= ruleCRITERION_DECL EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:420:2: iv_ruleCRITERION_DECL= ruleCRITERION_DECL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCRITERION_DECLRule()); 
            }
            pushFollow(FOLLOW_ruleCRITERION_DECL_in_entryRuleCRITERION_DECL837);
            iv_ruleCRITERION_DECL=ruleCRITERION_DECL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCRITERION_DECL; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCRITERION_DECL847); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:427:1: ruleCRITERION_DECL returns [EObject current=null] : (otherlv_0= 'crit' otherlv_1= ':' () ( (lv_crit_3_0= ruleCRITERION ) ) ( (lv_end_4_0= ruleEND ) ) ) ;
    public final EObject ruleCRITERION_DECL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        EObject lv_crit_3_0 = null;

        EObject lv_end_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:430:28: ( (otherlv_0= 'crit' otherlv_1= ':' () ( (lv_crit_3_0= ruleCRITERION ) ) ( (lv_end_4_0= ruleEND ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:431:1: (otherlv_0= 'crit' otherlv_1= ':' () ( (lv_crit_3_0= ruleCRITERION ) ) ( (lv_end_4_0= ruleEND ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:431:1: (otherlv_0= 'crit' otherlv_1= ':' () ( (lv_crit_3_0= ruleCRITERION ) ) ( (lv_end_4_0= ruleEND ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:431:3: otherlv_0= 'crit' otherlv_1= ':' () ( (lv_crit_3_0= ruleCRITERION ) ) ( (lv_end_4_0= ruleEND ) )
            {
            otherlv_0=(Token)match(input,23,FOLLOW_23_in_ruleCRITERION_DECL884); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getCRITERION_DECLAccess().getCritKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleCRITERION_DECL896); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getCRITERION_DECLAccess().getColonKeyword_1());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:439:1: ()
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:440:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCRITERION_DECLAccess().getCRITERION_DECLAction_2(),
                          current);
                  
            }

            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:445:2: ( (lv_crit_3_0= ruleCRITERION ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:446:1: (lv_crit_3_0= ruleCRITERION )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:446:1: (lv_crit_3_0= ruleCRITERION )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:447:3: lv_crit_3_0= ruleCRITERION
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCRITERION_DECLAccess().getCritCRITERIONParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleCRITERION_in_ruleCRITERION_DECL926);
            lv_crit_3_0=ruleCRITERION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCRITERION_DECLRule());
              	        }
                     		set(
                     			current, 
                     			"crit",
                      		lv_crit_3_0, 
                      		"CRITERION");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:463:2: ( (lv_end_4_0= ruleEND ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:464:1: (lv_end_4_0= ruleEND )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:464:1: (lv_end_4_0= ruleEND )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:465:3: lv_end_4_0= ruleEND
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCRITERION_DECLAccess().getEndENDParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEND_in_ruleCRITERION_DECL947);
            lv_end_4_0=ruleEND();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getCRITERION_DECLRule());
              	        }
                     		set(
                     			current, 
                     			"end",
                      		lv_end_4_0, 
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:489:1: entryRuleDATASEL_DECL returns [EObject current=null] : iv_ruleDATASEL_DECL= ruleDATASEL_DECL EOF ;
    public final EObject entryRuleDATASEL_DECL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDATASEL_DECL = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:490:2: (iv_ruleDATASEL_DECL= ruleDATASEL_DECL EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:491:2: iv_ruleDATASEL_DECL= ruleDATASEL_DECL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDATASEL_DECLRule()); 
            }
            pushFollow(FOLLOW_ruleDATASEL_DECL_in_entryRuleDATASEL_DECL983);
            iv_ruleDATASEL_DECL=ruleDATASEL_DECL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDATASEL_DECL; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDATASEL_DECL993); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:498:1: ruleDATASEL_DECL returns [EObject current=null] : (otherlv_0= 'datasel' otherlv_1= ':' () ( (lv_data1_3_0= ruleDATASEL ) ) (otherlv_4= ',' ( (lv_data2_5_0= ruleDATASEL ) ) )? ( (lv_end_6_0= ruleEND ) ) ) ;
    public final EObject ruleDATASEL_DECL() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_4=null;
        EObject lv_data1_3_0 = null;

        EObject lv_data2_5_0 = null;

        EObject lv_end_6_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:501:28: ( (otherlv_0= 'datasel' otherlv_1= ':' () ( (lv_data1_3_0= ruleDATASEL ) ) (otherlv_4= ',' ( (lv_data2_5_0= ruleDATASEL ) ) )? ( (lv_end_6_0= ruleEND ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:502:1: (otherlv_0= 'datasel' otherlv_1= ':' () ( (lv_data1_3_0= ruleDATASEL ) ) (otherlv_4= ',' ( (lv_data2_5_0= ruleDATASEL ) ) )? ( (lv_end_6_0= ruleEND ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:502:1: (otherlv_0= 'datasel' otherlv_1= ':' () ( (lv_data1_3_0= ruleDATASEL ) ) (otherlv_4= ',' ( (lv_data2_5_0= ruleDATASEL ) ) )? ( (lv_end_6_0= ruleEND ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:502:3: otherlv_0= 'datasel' otherlv_1= ':' () ( (lv_data1_3_0= ruleDATASEL ) ) (otherlv_4= ',' ( (lv_data2_5_0= ruleDATASEL ) ) )? ( (lv_end_6_0= ruleEND ) )
            {
            otherlv_0=(Token)match(input,25,FOLLOW_25_in_ruleDATASEL_DECL1030); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getDATASEL_DECLAccess().getDataselKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,24,FOLLOW_24_in_ruleDATASEL_DECL1042); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getDATASEL_DECLAccess().getColonKeyword_1());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:510:1: ()
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:511:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getDATASEL_DECLAccess().getDATASEL_DECLAction_2(),
                          current);
                  
            }

            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:516:2: ( (lv_data1_3_0= ruleDATASEL ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:517:1: (lv_data1_3_0= ruleDATASEL )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:517:1: (lv_data1_3_0= ruleDATASEL )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:518:3: lv_data1_3_0= ruleDATASEL
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDATASEL_DECLAccess().getData1DATASELParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleDATASEL_in_ruleDATASEL_DECL1072);
            lv_data1_3_0=ruleDATASEL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDATASEL_DECLRule());
              	        }
                     		set(
                     			current, 
                     			"data1",
                      		lv_data1_3_0, 
                      		"DATASEL");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:534:2: (otherlv_4= ',' ( (lv_data2_5_0= ruleDATASEL ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==26) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:534:4: otherlv_4= ',' ( (lv_data2_5_0= ruleDATASEL ) )
                    {
                    otherlv_4=(Token)match(input,26,FOLLOW_26_in_ruleDATASEL_DECL1085); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getDATASEL_DECLAccess().getCommaKeyword_4_0());
                          
                    }
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:538:1: ( (lv_data2_5_0= ruleDATASEL ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:539:1: (lv_data2_5_0= ruleDATASEL )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:539:1: (lv_data2_5_0= ruleDATASEL )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:540:3: lv_data2_5_0= ruleDATASEL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getDATASEL_DECLAccess().getData2DATASELParserRuleCall_4_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDATASEL_in_ruleDATASEL_DECL1106);
                    lv_data2_5_0=ruleDATASEL();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                      	        if (current==null) {
                      	            current = createModelElementForParent(grammarAccess.getDATASEL_DECLRule());
                      	        }
                             		set(
                             			current, 
                             			"data2",
                              		lv_data2_5_0, 
                              		"DATASEL");
                      	        afterParserOrEnumRuleCall();
                      	    
                    }

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:556:4: ( (lv_end_6_0= ruleEND ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:557:1: (lv_end_6_0= ruleEND )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:557:1: (lv_end_6_0= ruleEND )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:558:3: lv_end_6_0= ruleEND
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getDATASEL_DECLAccess().getEndENDParserRuleCall_5_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEND_in_ruleDATASEL_DECL1129);
            lv_end_6_0=ruleEND();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getDATASEL_DECLRule());
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
    // $ANTLR end "ruleDATASEL_DECL"


    // $ANTLR start "entryRuleEND"
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:582:1: entryRuleEND returns [EObject current=null] : iv_ruleEND= ruleEND EOF ;
    public final EObject entryRuleEND() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEND = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:583:2: (iv_ruleEND= ruleEND EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:584:2: iv_ruleEND= ruleEND EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getENDRule()); 
            }
            pushFollow(FOLLOW_ruleEND_in_entryRuleEND1165);
            iv_ruleEND=ruleEND();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEND; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEND1175); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:591:1: ruleEND returns [EObject current=null] : ( (lv_end_0_0= ';' ) ) ;
    public final EObject ruleEND() throws RecognitionException {
        EObject current = null;

        Token lv_end_0_0=null;

         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:594:28: ( ( (lv_end_0_0= ';' ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:595:1: ( (lv_end_0_0= ';' ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:595:1: ( (lv_end_0_0= ';' ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:596:1: (lv_end_0_0= ';' )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:596:1: (lv_end_0_0= ';' )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:597:3: lv_end_0_0= ';'
            {
            lv_end_0_0=(Token)match(input,27,FOLLOW_27_in_ruleEND1217); if (state.failed) return current;
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:618:1: entryRuleCRITERION returns [EObject current=null] : iv_ruleCRITERION= ruleCRITERION EOF ;
    public final EObject entryRuleCRITERION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCRITERION = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:619:2: (iv_ruleCRITERION= ruleCRITERION EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:620:2: iv_ruleCRITERION= ruleCRITERION EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCRITERIONRule()); 
            }
            pushFollow(FOLLOW_ruleCRITERION_in_entryRuleCRITERION1265);
            iv_ruleCRITERION=ruleCRITERION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCRITERION; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCRITERION1275); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:627:1: ruleCRITERION returns [EObject current=null] : ( ( (lv_crit_0_1= 'mcdc' | lv_crit_0_2= 'dc' | lv_crit_0_3= 'cc' ) ) ) ;
    public final EObject ruleCRITERION() throws RecognitionException {
        EObject current = null;

        Token lv_crit_0_1=null;
        Token lv_crit_0_2=null;
        Token lv_crit_0_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:630:28: ( ( ( (lv_crit_0_1= 'mcdc' | lv_crit_0_2= 'dc' | lv_crit_0_3= 'cc' ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:631:1: ( ( (lv_crit_0_1= 'mcdc' | lv_crit_0_2= 'dc' | lv_crit_0_3= 'cc' ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:631:1: ( ( (lv_crit_0_1= 'mcdc' | lv_crit_0_2= 'dc' | lv_crit_0_3= 'cc' ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:632:1: ( (lv_crit_0_1= 'mcdc' | lv_crit_0_2= 'dc' | lv_crit_0_3= 'cc' ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:632:1: ( (lv_crit_0_1= 'mcdc' | lv_crit_0_2= 'dc' | lv_crit_0_3= 'cc' ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:633:1: (lv_crit_0_1= 'mcdc' | lv_crit_0_2= 'dc' | lv_crit_0_3= 'cc' )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:633:1: (lv_crit_0_1= 'mcdc' | lv_crit_0_2= 'dc' | lv_crit_0_3= 'cc' )
            int alt5=3;
            switch ( input.LA(1) ) {
            case 28:
                {
                alt5=1;
                }
                break;
            case 29:
                {
                alt5=2;
                }
                break;
            case 30:
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:634:3: lv_crit_0_1= 'mcdc'
                    {
                    lv_crit_0_1=(Token)match(input,28,FOLLOW_28_in_ruleCRITERION1319); if (state.failed) return current;
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:646:8: lv_crit_0_2= 'dc'
                    {
                    lv_crit_0_2=(Token)match(input,29,FOLLOW_29_in_ruleCRITERION1348); if (state.failed) return current;
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:658:8: lv_crit_0_3= 'cc'
                    {
                    lv_crit_0_3=(Token)match(input,30,FOLLOW_30_in_ruleCRITERION1377); if (state.failed) return current;
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:681:1: entryRuleDATASEL returns [EObject current=null] : iv_ruleDATASEL= ruleDATASEL EOF ;
    public final EObject entryRuleDATASEL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDATASEL = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:682:2: (iv_ruleDATASEL= ruleDATASEL EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:683:2: iv_ruleDATASEL= ruleDATASEL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDATASELRule()); 
            }
            pushFollow(FOLLOW_ruleDATASEL_in_entryRuleDATASEL1428);
            iv_ruleDATASEL=ruleDATASEL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDATASEL; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDATASEL1438); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:690:1: ruleDATASEL returns [EObject current=null] : ( ( (lv_sel_0_1= 'rand' | lv_sel_0_2= 'eqv' | lv_sel_0_3= 'bv' ) ) ) ;
    public final EObject ruleDATASEL() throws RecognitionException {
        EObject current = null;

        Token lv_sel_0_1=null;
        Token lv_sel_0_2=null;
        Token lv_sel_0_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:693:28: ( ( ( (lv_sel_0_1= 'rand' | lv_sel_0_2= 'eqv' | lv_sel_0_3= 'bv' ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:694:1: ( ( (lv_sel_0_1= 'rand' | lv_sel_0_2= 'eqv' | lv_sel_0_3= 'bv' ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:694:1: ( ( (lv_sel_0_1= 'rand' | lv_sel_0_2= 'eqv' | lv_sel_0_3= 'bv' ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:695:1: ( (lv_sel_0_1= 'rand' | lv_sel_0_2= 'eqv' | lv_sel_0_3= 'bv' ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:695:1: ( (lv_sel_0_1= 'rand' | lv_sel_0_2= 'eqv' | lv_sel_0_3= 'bv' ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:696:1: (lv_sel_0_1= 'rand' | lv_sel_0_2= 'eqv' | lv_sel_0_3= 'bv' )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:696:1: (lv_sel_0_1= 'rand' | lv_sel_0_2= 'eqv' | lv_sel_0_3= 'bv' )
            int alt6=3;
            switch ( input.LA(1) ) {
            case 31:
                {
                alt6=1;
                }
                break;
            case 32:
                {
                alt6=2;
                }
                break;
            case 33:
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:697:3: lv_sel_0_1= 'rand'
                    {
                    lv_sel_0_1=(Token)match(input,31,FOLLOW_31_in_ruleDATASEL1482); if (state.failed) return current;
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:709:8: lv_sel_0_2= 'eqv'
                    {
                    lv_sel_0_2=(Token)match(input,32,FOLLOW_32_in_ruleDATASEL1511); if (state.failed) return current;
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:721:8: lv_sel_0_3= 'bv'
                    {
                    lv_sel_0_3=(Token)match(input,33,FOLLOW_33_in_ruleDATASEL1540); if (state.failed) return current;
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:744:1: entryRuleVAR_CST returns [EObject current=null] : iv_ruleVAR_CST= ruleVAR_CST EOF ;
    public final EObject entryRuleVAR_CST() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVAR_CST = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:745:2: (iv_ruleVAR_CST= ruleVAR_CST EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:746:2: iv_ruleVAR_CST= ruleVAR_CST EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVAR_CSTRule()); 
            }
            pushFollow(FOLLOW_ruleVAR_CST_in_entryRuleVAR_CST1591);
            iv_ruleVAR_CST=ruleVAR_CST();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVAR_CST; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVAR_CST1601); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:753:1: ruleVAR_CST returns [EObject current=null] : (this_VAR_0= ruleVAR | this_CST_1= ruleCST ) ;
    public final EObject ruleVAR_CST() throws RecognitionException {
        EObject current = null;

        EObject this_VAR_0 = null;

        EObject this_CST_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:756:28: ( (this_VAR_0= ruleVAR | this_CST_1= ruleCST ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:757:1: (this_VAR_0= ruleVAR | this_CST_1= ruleCST )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:757:1: (this_VAR_0= ruleVAR | this_CST_1= ruleCST )
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( ((LA7_0>=34 && LA7_0<=37)) ) {
                alt7=1;
            }
            else if ( (LA7_0==38) ) {
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:758:5: this_VAR_0= ruleVAR
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVAR_CSTAccess().getVARParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleVAR_in_ruleVAR_CST1648);
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:768:5: this_CST_1= ruleCST
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getVAR_CSTAccess().getCSTParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleCST_in_ruleVAR_CST1675);
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:784:1: entryRuleVAR returns [EObject current=null] : iv_ruleVAR= ruleVAR EOF ;
    public final EObject entryRuleVAR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVAR = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:785:2: (iv_ruleVAR= ruleVAR EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:786:2: iv_ruleVAR= ruleVAR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getVARRule()); 
            }
            pushFollow(FOLLOW_ruleVAR_in_entryRuleVAR1710);
            iv_ruleVAR=ruleVAR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleVAR; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleVAR1720); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:793:1: ruleVAR returns [EObject current=null] : ( () ( (lv_flow_1_0= ruleFlow ) ) ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= ':' ( (lv_type_4_0= ruleTYPE ) ) ( (lv_range_5_0= ruleRANGE ) )? ( (lv_end_6_0= ruleEND ) ) ) ;
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
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:796:28: ( ( () ( (lv_flow_1_0= ruleFlow ) ) ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= ':' ( (lv_type_4_0= ruleTYPE ) ) ( (lv_range_5_0= ruleRANGE ) )? ( (lv_end_6_0= ruleEND ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:797:1: ( () ( (lv_flow_1_0= ruleFlow ) ) ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= ':' ( (lv_type_4_0= ruleTYPE ) ) ( (lv_range_5_0= ruleRANGE ) )? ( (lv_end_6_0= ruleEND ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:797:1: ( () ( (lv_flow_1_0= ruleFlow ) ) ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= ':' ( (lv_type_4_0= ruleTYPE ) ) ( (lv_range_5_0= ruleRANGE ) )? ( (lv_end_6_0= ruleEND ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:797:2: () ( (lv_flow_1_0= ruleFlow ) ) ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= ':' ( (lv_type_4_0= ruleTYPE ) ) ( (lv_range_5_0= ruleRANGE ) )? ( (lv_end_6_0= ruleEND ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:797:2: ()
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:798:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getVARAccess().getVARAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:803:2: ( (lv_flow_1_0= ruleFlow ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:804:1: (lv_flow_1_0= ruleFlow )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:804:1: (lv_flow_1_0= ruleFlow )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:805:3: lv_flow_1_0= ruleFlow
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVARAccess().getFlowFlowParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleFlow_in_ruleVAR1775);
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

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:821:2: ( (lv_name_2_0= RULE_IDENT ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:822:1: (lv_name_2_0= RULE_IDENT )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:822:1: (lv_name_2_0= RULE_IDENT )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:823:3: lv_name_2_0= RULE_IDENT
            {
            lv_name_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleVAR1792); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,24,FOLLOW_24_in_ruleVAR1809); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getVARAccess().getColonKeyword_3());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:843:1: ( (lv_type_4_0= ruleTYPE ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:844:1: (lv_type_4_0= ruleTYPE )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:844:1: (lv_type_4_0= ruleTYPE )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:845:3: lv_type_4_0= ruleTYPE
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVARAccess().getTypeTYPEParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTYPE_in_ruleVAR1830);
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

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:861:2: ( (lv_range_5_0= ruleRANGE ) )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==17||(LA8_0>=49 && LA8_0<=50)) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:862:1: (lv_range_5_0= ruleRANGE )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:862:1: (lv_range_5_0= ruleRANGE )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:863:3: lv_range_5_0= ruleRANGE
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getVARAccess().getRangeRANGEParserRuleCall_5_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleRANGE_in_ruleVAR1851);
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

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:879:3: ( (lv_end_6_0= ruleEND ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:880:1: (lv_end_6_0= ruleEND )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:880:1: (lv_end_6_0= ruleEND )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:881:3: lv_end_6_0= ruleEND
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getVARAccess().getEndENDParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEND_in_ruleVAR1873);
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:905:1: entryRuleFlow returns [EObject current=null] : iv_ruleFlow= ruleFlow EOF ;
    public final EObject entryRuleFlow() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleFlow = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:906:2: (iv_ruleFlow= ruleFlow EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:907:2: iv_ruleFlow= ruleFlow EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getFlowRule()); 
            }
            pushFollow(FOLLOW_ruleFlow_in_entryRuleFlow1909);
            iv_ruleFlow=ruleFlow();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleFlow; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleFlow1919); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:914:1: ruleFlow returns [EObject current=null] : ( ( (lv_flow_0_1= 'in' | lv_flow_0_2= 'out' | lv_flow_0_3= 'inout' | lv_flow_0_4= 'tmp' ) ) ) ;
    public final EObject ruleFlow() throws RecognitionException {
        EObject current = null;

        Token lv_flow_0_1=null;
        Token lv_flow_0_2=null;
        Token lv_flow_0_3=null;
        Token lv_flow_0_4=null;

         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:917:28: ( ( ( (lv_flow_0_1= 'in' | lv_flow_0_2= 'out' | lv_flow_0_3= 'inout' | lv_flow_0_4= 'tmp' ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:918:1: ( ( (lv_flow_0_1= 'in' | lv_flow_0_2= 'out' | lv_flow_0_3= 'inout' | lv_flow_0_4= 'tmp' ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:918:1: ( ( (lv_flow_0_1= 'in' | lv_flow_0_2= 'out' | lv_flow_0_3= 'inout' | lv_flow_0_4= 'tmp' ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:919:1: ( (lv_flow_0_1= 'in' | lv_flow_0_2= 'out' | lv_flow_0_3= 'inout' | lv_flow_0_4= 'tmp' ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:919:1: ( (lv_flow_0_1= 'in' | lv_flow_0_2= 'out' | lv_flow_0_3= 'inout' | lv_flow_0_4= 'tmp' ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:920:1: (lv_flow_0_1= 'in' | lv_flow_0_2= 'out' | lv_flow_0_3= 'inout' | lv_flow_0_4= 'tmp' )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:920:1: (lv_flow_0_1= 'in' | lv_flow_0_2= 'out' | lv_flow_0_3= 'inout' | lv_flow_0_4= 'tmp' )
            int alt9=4;
            switch ( input.LA(1) ) {
            case 34:
                {
                alt9=1;
                }
                break;
            case 35:
                {
                alt9=2;
                }
                break;
            case 36:
                {
                alt9=3;
                }
                break;
            case 37:
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:921:3: lv_flow_0_1= 'in'
                    {
                    lv_flow_0_1=(Token)match(input,34,FOLLOW_34_in_ruleFlow1963); if (state.failed) return current;
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:933:8: lv_flow_0_2= 'out'
                    {
                    lv_flow_0_2=(Token)match(input,35,FOLLOW_35_in_ruleFlow1992); if (state.failed) return current;
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:945:8: lv_flow_0_3= 'inout'
                    {
                    lv_flow_0_3=(Token)match(input,36,FOLLOW_36_in_ruleFlow2021); if (state.failed) return current;
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:957:8: lv_flow_0_4= 'tmp'
                    {
                    lv_flow_0_4=(Token)match(input,37,FOLLOW_37_in_ruleFlow2050); if (state.failed) return current;
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:980:1: entryRuleCST returns [EObject current=null] : iv_ruleCST= ruleCST EOF ;
    public final EObject entryRuleCST() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCST = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:981:2: (iv_ruleCST= ruleCST EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:982:2: iv_ruleCST= ruleCST EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCSTRule()); 
            }
            pushFollow(FOLLOW_ruleCST_in_entryRuleCST2101);
            iv_ruleCST=ruleCST();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCST; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCST2111); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:989:1: ruleCST returns [EObject current=null] : ( () ( (lv_flow_1_0= 'cst' ) ) ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '==' ( (lv_type_4_0= ruleTYPE ) ) otherlv_5= '(' ( (lv_value_6_0= ruleLiteral ) ) otherlv_7= ')' ( (lv_end_8_0= ruleEND ) ) ) ;
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
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:992:28: ( ( () ( (lv_flow_1_0= 'cst' ) ) ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '==' ( (lv_type_4_0= ruleTYPE ) ) otherlv_5= '(' ( (lv_value_6_0= ruleLiteral ) ) otherlv_7= ')' ( (lv_end_8_0= ruleEND ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:993:1: ( () ( (lv_flow_1_0= 'cst' ) ) ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '==' ( (lv_type_4_0= ruleTYPE ) ) otherlv_5= '(' ( (lv_value_6_0= ruleLiteral ) ) otherlv_7= ')' ( (lv_end_8_0= ruleEND ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:993:1: ( () ( (lv_flow_1_0= 'cst' ) ) ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '==' ( (lv_type_4_0= ruleTYPE ) ) otherlv_5= '(' ( (lv_value_6_0= ruleLiteral ) ) otherlv_7= ')' ( (lv_end_8_0= ruleEND ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:993:2: () ( (lv_flow_1_0= 'cst' ) ) ( (lv_name_2_0= RULE_IDENT ) ) otherlv_3= '==' ( (lv_type_4_0= ruleTYPE ) ) otherlv_5= '(' ( (lv_value_6_0= ruleLiteral ) ) otherlv_7= ')' ( (lv_end_8_0= ruleEND ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:993:2: ()
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:994:5: 
            {
            if ( state.backtracking==0 ) {

                      current = forceCreateModelElement(
                          grammarAccess.getCSTAccess().getCSTAction_0(),
                          current);
                  
            }

            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:999:2: ( (lv_flow_1_0= 'cst' ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1000:1: (lv_flow_1_0= 'cst' )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1000:1: (lv_flow_1_0= 'cst' )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1001:3: lv_flow_1_0= 'cst'
            {
            lv_flow_1_0=(Token)match(input,38,FOLLOW_38_in_ruleCST2163); if (state.failed) return current;
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

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1014:2: ( (lv_name_2_0= RULE_IDENT ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1015:1: (lv_name_2_0= RULE_IDENT )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1015:1: (lv_name_2_0= RULE_IDENT )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1016:3: lv_name_2_0= RULE_IDENT
            {
            lv_name_2_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleCST2193); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,39,FOLLOW_39_in_ruleCST2210); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getCSTAccess().getEqualsSignEqualsSignKeyword_3());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1036:1: ( (lv_type_4_0= ruleTYPE ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1037:1: (lv_type_4_0= ruleTYPE )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1037:1: (lv_type_4_0= ruleTYPE )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1038:3: lv_type_4_0= ruleTYPE
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSTAccess().getTypeTYPEParserRuleCall_4_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleTYPE_in_ruleCST2231);
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

            otherlv_5=(Token)match(input,40,FOLLOW_40_in_ruleCST2243); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getCSTAccess().getLeftParenthesisKeyword_5());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1058:1: ( (lv_value_6_0= ruleLiteral ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1059:1: (lv_value_6_0= ruleLiteral )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1059:1: (lv_value_6_0= ruleLiteral )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1060:3: lv_value_6_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSTAccess().getValueLiteralParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_ruleCST2264);
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

            otherlv_7=(Token)match(input,41,FOLLOW_41_in_ruleCST2276); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getCSTAccess().getRightParenthesisKeyword_7());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1080:1: ( (lv_end_8_0= ruleEND ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1081:1: (lv_end_8_0= ruleEND )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1081:1: (lv_end_8_0= ruleEND )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1082:3: lv_end_8_0= ruleEND
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getCSTAccess().getEndENDParserRuleCall_8_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEND_in_ruleCST2297);
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1106:1: entryRuleTYPE returns [EObject current=null] : iv_ruleTYPE= ruleTYPE EOF ;
    public final EObject entryRuleTYPE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleTYPE = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1107:2: (iv_ruleTYPE= ruleTYPE EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1108:2: iv_ruleTYPE= ruleTYPE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getTYPERule()); 
            }
            pushFollow(FOLLOW_ruleTYPE_in_entryRuleTYPE2333);
            iv_ruleTYPE=ruleTYPE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleTYPE; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleTYPE2343); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1115:1: ruleTYPE returns [EObject current=null] : ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'real' | lv_type_0_3= 'bool' | lv_type_0_4= 'enum' | lv_type_0_5= 'bit' | lv_type_0_6= 'hex' | lv_type_0_7= 'str' ) ) ) ;
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
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1118:28: ( ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'real' | lv_type_0_3= 'bool' | lv_type_0_4= 'enum' | lv_type_0_5= 'bit' | lv_type_0_6= 'hex' | lv_type_0_7= 'str' ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1119:1: ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'real' | lv_type_0_3= 'bool' | lv_type_0_4= 'enum' | lv_type_0_5= 'bit' | lv_type_0_6= 'hex' | lv_type_0_7= 'str' ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1119:1: ( ( (lv_type_0_1= 'int' | lv_type_0_2= 'real' | lv_type_0_3= 'bool' | lv_type_0_4= 'enum' | lv_type_0_5= 'bit' | lv_type_0_6= 'hex' | lv_type_0_7= 'str' ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1120:1: ( (lv_type_0_1= 'int' | lv_type_0_2= 'real' | lv_type_0_3= 'bool' | lv_type_0_4= 'enum' | lv_type_0_5= 'bit' | lv_type_0_6= 'hex' | lv_type_0_7= 'str' ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1120:1: ( (lv_type_0_1= 'int' | lv_type_0_2= 'real' | lv_type_0_3= 'bool' | lv_type_0_4= 'enum' | lv_type_0_5= 'bit' | lv_type_0_6= 'hex' | lv_type_0_7= 'str' ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1121:1: (lv_type_0_1= 'int' | lv_type_0_2= 'real' | lv_type_0_3= 'bool' | lv_type_0_4= 'enum' | lv_type_0_5= 'bit' | lv_type_0_6= 'hex' | lv_type_0_7= 'str' )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1121:1: (lv_type_0_1= 'int' | lv_type_0_2= 'real' | lv_type_0_3= 'bool' | lv_type_0_4= 'enum' | lv_type_0_5= 'bit' | lv_type_0_6= 'hex' | lv_type_0_7= 'str' )
            int alt10=7;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt10=1;
                }
                break;
            case 43:
                {
                alt10=2;
                }
                break;
            case 44:
                {
                alt10=3;
                }
                break;
            case 45:
                {
                alt10=4;
                }
                break;
            case 46:
                {
                alt10=5;
                }
                break;
            case 47:
                {
                alt10=6;
                }
                break;
            case 48:
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1122:3: lv_type_0_1= 'int'
                    {
                    lv_type_0_1=(Token)match(input,42,FOLLOW_42_in_ruleTYPE2387); if (state.failed) return current;
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1134:8: lv_type_0_2= 'real'
                    {
                    lv_type_0_2=(Token)match(input,43,FOLLOW_43_in_ruleTYPE2416); if (state.failed) return current;
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1146:8: lv_type_0_3= 'bool'
                    {
                    lv_type_0_3=(Token)match(input,44,FOLLOW_44_in_ruleTYPE2445); if (state.failed) return current;
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1158:8: lv_type_0_4= 'enum'
                    {
                    lv_type_0_4=(Token)match(input,45,FOLLOW_45_in_ruleTYPE2474); if (state.failed) return current;
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1170:8: lv_type_0_5= 'bit'
                    {
                    lv_type_0_5=(Token)match(input,46,FOLLOW_46_in_ruleTYPE2503); if (state.failed) return current;
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1182:8: lv_type_0_6= 'hex'
                    {
                    lv_type_0_6=(Token)match(input,47,FOLLOW_47_in_ruleTYPE2532); if (state.failed) return current;
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1194:8: lv_type_0_7= 'str'
                    {
                    lv_type_0_7=(Token)match(input,48,FOLLOW_48_in_ruleTYPE2561); if (state.failed) return current;
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1217:1: entryRuleRANGE returns [EObject current=null] : iv_ruleRANGE= ruleRANGE EOF ;
    public final EObject entryRuleRANGE() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRANGE = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1218:2: (iv_ruleRANGE= ruleRANGE EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1219:2: iv_ruleRANGE= ruleRANGE EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getRANGERule()); 
            }
            pushFollow(FOLLOW_ruleRANGE_in_entryRuleRANGE2612);
            iv_ruleRANGE=ruleRANGE();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleRANGE; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleRANGE2622); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1226:1: ruleRANGE returns [EObject current=null] : (this_INTERVAL_0= ruleINTERVAL | this_LSET_1= ruleLSET ) ;
    public final EObject ruleRANGE() throws RecognitionException {
        EObject current = null;

        EObject this_INTERVAL_0 = null;

        EObject this_LSET_1 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1229:28: ( (this_INTERVAL_0= ruleINTERVAL | this_LSET_1= ruleLSET ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1230:1: (this_INTERVAL_0= ruleINTERVAL | this_LSET_1= ruleLSET )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1230:1: (this_INTERVAL_0= ruleINTERVAL | this_LSET_1= ruleLSET )
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( ((LA11_0>=49 && LA11_0<=50)) ) {
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1231:5: this_INTERVAL_0= ruleINTERVAL
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRANGEAccess().getINTERVALParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleINTERVAL_in_ruleRANGE2669);
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1241:5: this_LSET_1= ruleLSET
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getRANGEAccess().getLSETParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLSET_in_ruleRANGE2696);
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1257:1: entryRuleINTERVAL returns [EObject current=null] : iv_ruleINTERVAL= ruleINTERVAL EOF ;
    public final EObject entryRuleINTERVAL() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleINTERVAL = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1258:2: (iv_ruleINTERVAL= ruleINTERVAL EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1259:2: iv_ruleINTERVAL= ruleINTERVAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getINTERVALRule()); 
            }
            pushFollow(FOLLOW_ruleINTERVAL_in_entryRuleINTERVAL2731);
            iv_ruleINTERVAL=ruleINTERVAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleINTERVAL; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleINTERVAL2741); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1266:1: ruleINTERVAL returns [EObject current=null] : ( ( ( (lv_lsqbr_0_1= ']' | lv_lsqbr_0_2= '[' ) ) ) ( (lv_min_1_0= ruleLiteral ) ) otherlv_2= '..' ( (lv_max_3_0= ruleLiteral ) ) ( ( (lv_rsqbr_4_1= ']' | lv_rsqbr_4_2= '[' ) ) ) ) ;
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
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1269:28: ( ( ( ( (lv_lsqbr_0_1= ']' | lv_lsqbr_0_2= '[' ) ) ) ( (lv_min_1_0= ruleLiteral ) ) otherlv_2= '..' ( (lv_max_3_0= ruleLiteral ) ) ( ( (lv_rsqbr_4_1= ']' | lv_rsqbr_4_2= '[' ) ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1270:1: ( ( ( (lv_lsqbr_0_1= ']' | lv_lsqbr_0_2= '[' ) ) ) ( (lv_min_1_0= ruleLiteral ) ) otherlv_2= '..' ( (lv_max_3_0= ruleLiteral ) ) ( ( (lv_rsqbr_4_1= ']' | lv_rsqbr_4_2= '[' ) ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1270:1: ( ( ( (lv_lsqbr_0_1= ']' | lv_lsqbr_0_2= '[' ) ) ) ( (lv_min_1_0= ruleLiteral ) ) otherlv_2= '..' ( (lv_max_3_0= ruleLiteral ) ) ( ( (lv_rsqbr_4_1= ']' | lv_rsqbr_4_2= '[' ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1270:2: ( ( (lv_lsqbr_0_1= ']' | lv_lsqbr_0_2= '[' ) ) ) ( (lv_min_1_0= ruleLiteral ) ) otherlv_2= '..' ( (lv_max_3_0= ruleLiteral ) ) ( ( (lv_rsqbr_4_1= ']' | lv_rsqbr_4_2= '[' ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1270:2: ( ( (lv_lsqbr_0_1= ']' | lv_lsqbr_0_2= '[' ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1271:1: ( (lv_lsqbr_0_1= ']' | lv_lsqbr_0_2= '[' ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1271:1: ( (lv_lsqbr_0_1= ']' | lv_lsqbr_0_2= '[' ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1272:1: (lv_lsqbr_0_1= ']' | lv_lsqbr_0_2= '[' )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1272:1: (lv_lsqbr_0_1= ']' | lv_lsqbr_0_2= '[' )
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==49) ) {
                alt12=1;
            }
            else if ( (LA12_0==50) ) {
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1273:3: lv_lsqbr_0_1= ']'
                    {
                    lv_lsqbr_0_1=(Token)match(input,49,FOLLOW_49_in_ruleINTERVAL2786); if (state.failed) return current;
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1285:8: lv_lsqbr_0_2= '['
                    {
                    lv_lsqbr_0_2=(Token)match(input,50,FOLLOW_50_in_ruleINTERVAL2815); if (state.failed) return current;
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

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1300:2: ( (lv_min_1_0= ruleLiteral ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1301:1: (lv_min_1_0= ruleLiteral )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1301:1: (lv_min_1_0= ruleLiteral )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1302:3: lv_min_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getINTERVALAccess().getMinLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_ruleINTERVAL2852);
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

            otherlv_2=(Token)match(input,51,FOLLOW_51_in_ruleINTERVAL2864); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_2, grammarAccess.getINTERVALAccess().getFullStopFullStopKeyword_2());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1322:1: ( (lv_max_3_0= ruleLiteral ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1323:1: (lv_max_3_0= ruleLiteral )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1323:1: (lv_max_3_0= ruleLiteral )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1324:3: lv_max_3_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getINTERVALAccess().getMaxLiteralParserRuleCall_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_ruleINTERVAL2885);
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

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1340:2: ( ( (lv_rsqbr_4_1= ']' | lv_rsqbr_4_2= '[' ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1341:1: ( (lv_rsqbr_4_1= ']' | lv_rsqbr_4_2= '[' ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1341:1: ( (lv_rsqbr_4_1= ']' | lv_rsqbr_4_2= '[' ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1342:1: (lv_rsqbr_4_1= ']' | lv_rsqbr_4_2= '[' )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1342:1: (lv_rsqbr_4_1= ']' | lv_rsqbr_4_2= '[' )
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==49) ) {
                alt13=1;
            }
            else if ( (LA13_0==50) ) {
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1343:3: lv_rsqbr_4_1= ']'
                    {
                    lv_rsqbr_4_1=(Token)match(input,49,FOLLOW_49_in_ruleINTERVAL2905); if (state.failed) return current;
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1355:8: lv_rsqbr_4_2= '['
                    {
                    lv_rsqbr_4_2=(Token)match(input,50,FOLLOW_50_in_ruleINTERVAL2934); if (state.failed) return current;
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1378:1: entryRuleLSET returns [EObject current=null] : iv_ruleLSET= ruleLSET EOF ;
    public final EObject entryRuleLSET() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLSET = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1379:2: (iv_ruleLSET= ruleLSET EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1380:2: iv_ruleLSET= ruleLSET EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLSETRule()); 
            }
            pushFollow(FOLLOW_ruleLSET_in_entryRuleLSET2986);
            iv_ruleLSET=ruleLSET();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLSET; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLSET2996); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1387:1: ruleLSET returns [EObject current=null] : (otherlv_0= '{' ( (lv_value_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleLiteral ) ) )* otherlv_4= '}' ) ;
    public final EObject ruleLSET() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject lv_value_1_0 = null;

        EObject lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1390:28: ( (otherlv_0= '{' ( (lv_value_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleLiteral ) ) )* otherlv_4= '}' ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1391:1: (otherlv_0= '{' ( (lv_value_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleLiteral ) ) )* otherlv_4= '}' )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1391:1: (otherlv_0= '{' ( (lv_value_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleLiteral ) ) )* otherlv_4= '}' )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1391:3: otherlv_0= '{' ( (lv_value_1_0= ruleLiteral ) ) (otherlv_2= ',' ( (lv_value_3_0= ruleLiteral ) ) )* otherlv_4= '}'
            {
            otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleLSET3033); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLSETAccess().getLeftCurlyBracketKeyword_0());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1395:1: ( (lv_value_1_0= ruleLiteral ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1396:1: (lv_value_1_0= ruleLiteral )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1396:1: (lv_value_1_0= ruleLiteral )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1397:3: lv_value_1_0= ruleLiteral
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getLSETAccess().getValueLiteralParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleLiteral_in_ruleLSET3054);
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

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1413:2: (otherlv_2= ',' ( (lv_value_3_0= ruleLiteral ) ) )*
            loop14:
            do {
                int alt14=2;
                int LA14_0 = input.LA(1);

                if ( (LA14_0==26) ) {
                    alt14=1;
                }


                switch (alt14) {
            	case 1 :
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1413:4: otherlv_2= ',' ( (lv_value_3_0= ruleLiteral ) )
            	    {
            	    otherlv_2=(Token)match(input,26,FOLLOW_26_in_ruleLSET3067); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getLSETAccess().getCommaKeyword_2_0());
            	          
            	    }
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1417:1: ( (lv_value_3_0= ruleLiteral ) )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1418:1: (lv_value_3_0= ruleLiteral )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1418:1: (lv_value_3_0= ruleLiteral )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1419:3: lv_value_3_0= ruleLiteral
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getLSETAccess().getValueLiteralParserRuleCall_2_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleLiteral_in_ruleLSET3088);
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

            otherlv_4=(Token)match(input,18,FOLLOW_18_in_ruleLSET3102); if (state.failed) return current;
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1447:1: entryRuleLiteral returns [EObject current=null] : iv_ruleLiteral= ruleLiteral EOF ;
    public final EObject entryRuleLiteral() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLiteral = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1448:2: (iv_ruleLiteral= ruleLiteral EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1449:2: iv_ruleLiteral= ruleLiteral EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLiteralRule()); 
            }
            pushFollow(FOLLOW_ruleLiteral_in_entryRuleLiteral3138);
            iv_ruleLiteral=ruleLiteral();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLiteral; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLiteral3148); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1456:1: ruleLiteral returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleINTEGER ) ) ) | ( () ( (lv_value_3_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_ENUM_ELEMENT ) ) ) | ( () ( (lv_value_11_0= RULE_BIT ) ) ) | ( () ( (lv_value_13_0= RULE_HEX ) ) ) | ( () ( (lv_value_15_0= RULE_IDENT ) ) ) | ( () ( (lv_value_17_0= '?' ) ) ) ) ;
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
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1459:28: ( ( ( () ( (lv_value_1_0= ruleINTEGER ) ) ) | ( () ( (lv_value_3_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_ENUM_ELEMENT ) ) ) | ( () ( (lv_value_11_0= RULE_BIT ) ) ) | ( () ( (lv_value_13_0= RULE_HEX ) ) ) | ( () ( (lv_value_15_0= RULE_IDENT ) ) ) | ( () ( (lv_value_17_0= '?' ) ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1460:1: ( ( () ( (lv_value_1_0= ruleINTEGER ) ) ) | ( () ( (lv_value_3_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_ENUM_ELEMENT ) ) ) | ( () ( (lv_value_11_0= RULE_BIT ) ) ) | ( () ( (lv_value_13_0= RULE_HEX ) ) ) | ( () ( (lv_value_15_0= RULE_IDENT ) ) ) | ( () ( (lv_value_17_0= '?' ) ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1460:1: ( ( () ( (lv_value_1_0= ruleINTEGER ) ) ) | ( () ( (lv_value_3_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_ENUM_ELEMENT ) ) ) | ( () ( (lv_value_11_0= RULE_BIT ) ) ) | ( () ( (lv_value_13_0= RULE_HEX ) ) ) | ( () ( (lv_value_15_0= RULE_IDENT ) ) ) | ( () ( (lv_value_17_0= '?' ) ) ) )
            int alt15=9;
            alt15 = dfa15.predict(input);
            switch (alt15) {
                case 1 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1460:2: ( () ( (lv_value_1_0= ruleINTEGER ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1460:2: ( () ( (lv_value_1_0= ruleINTEGER ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1460:3: () ( (lv_value_1_0= ruleINTEGER ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1460:3: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1461:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralAccess().getIntLITERALAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1466:2: ( (lv_value_1_0= ruleINTEGER ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1467:1: (lv_value_1_0= ruleINTEGER )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1467:1: (lv_value_1_0= ruleINTEGER )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1468:3: lv_value_1_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralAccess().getValueINTEGERParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleINTEGER_in_ruleLiteral3204);
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1485:6: ( () ( (lv_value_3_0= ruleDECIMAL ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1485:6: ( () ( (lv_value_3_0= ruleDECIMAL ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1485:7: () ( (lv_value_3_0= ruleDECIMAL ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1485:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1486:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralAccess().getRealLITERALAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1491:2: ( (lv_value_3_0= ruleDECIMAL ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1492:1: (lv_value_3_0= ruleDECIMAL )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1492:1: (lv_value_3_0= ruleDECIMAL )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1493:3: lv_value_3_0= ruleDECIMAL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getLiteralAccess().getValueDECIMALParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDECIMAL_in_ruleLiteral3242);
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1510:6: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1510:6: ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1510:7: () ( (lv_value_5_0= RULE_BOOLEAN ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1510:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1511:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralAccess().getBoolLITERALAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1516:2: ( (lv_value_5_0= RULE_BOOLEAN ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1517:1: (lv_value_5_0= RULE_BOOLEAN )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1517:1: (lv_value_5_0= RULE_BOOLEAN )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1518:3: lv_value_5_0= RULE_BOOLEAN
                    {
                    lv_value_5_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleLiteral3276); if (state.failed) return current;
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1535:6: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1535:6: ( () ( (lv_value_7_0= RULE_STRING ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1535:7: () ( (lv_value_7_0= RULE_STRING ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1535:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1536:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralAccess().getStrLITERALAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1541:2: ( (lv_value_7_0= RULE_STRING ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1542:1: (lv_value_7_0= RULE_STRING )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1542:1: (lv_value_7_0= RULE_STRING )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1543:3: lv_value_7_0= RULE_STRING
                    {
                    lv_value_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleLiteral3315); if (state.failed) return current;
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1560:6: ( () ( (lv_value_9_0= RULE_ENUM_ELEMENT ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1560:6: ( () ( (lv_value_9_0= RULE_ENUM_ELEMENT ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1560:7: () ( (lv_value_9_0= RULE_ENUM_ELEMENT ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1560:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1561:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralAccess().getEnumLITERALAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1566:2: ( (lv_value_9_0= RULE_ENUM_ELEMENT ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1567:1: (lv_value_9_0= RULE_ENUM_ELEMENT )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1567:1: (lv_value_9_0= RULE_ENUM_ELEMENT )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1568:3: lv_value_9_0= RULE_ENUM_ELEMENT
                    {
                    lv_value_9_0=(Token)match(input,RULE_ENUM_ELEMENT,FOLLOW_RULE_ENUM_ELEMENT_in_ruleLiteral3354); if (state.failed) return current;
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1585:6: ( () ( (lv_value_11_0= RULE_BIT ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1585:6: ( () ( (lv_value_11_0= RULE_BIT ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1585:7: () ( (lv_value_11_0= RULE_BIT ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1585:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1586:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralAccess().getBitLITERALAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1591:2: ( (lv_value_11_0= RULE_BIT ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1592:1: (lv_value_11_0= RULE_BIT )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1592:1: (lv_value_11_0= RULE_BIT )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1593:3: lv_value_11_0= RULE_BIT
                    {
                    lv_value_11_0=(Token)match(input,RULE_BIT,FOLLOW_RULE_BIT_in_ruleLiteral3393); if (state.failed) return current;
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1610:6: ( () ( (lv_value_13_0= RULE_HEX ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1610:6: ( () ( (lv_value_13_0= RULE_HEX ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1610:7: () ( (lv_value_13_0= RULE_HEX ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1610:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1611:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralAccess().getHexLITERALAction_6_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1616:2: ( (lv_value_13_0= RULE_HEX ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1617:1: (lv_value_13_0= RULE_HEX )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1617:1: (lv_value_13_0= RULE_HEX )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1618:3: lv_value_13_0= RULE_HEX
                    {
                    lv_value_13_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleLiteral3432); if (state.failed) return current;
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1635:6: ( () ( (lv_value_15_0= RULE_IDENT ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1635:6: ( () ( (lv_value_15_0= RULE_IDENT ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1635:7: () ( (lv_value_15_0= RULE_IDENT ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1635:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1636:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralAccess().getIdentLITERALAction_7_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1641:2: ( (lv_value_15_0= RULE_IDENT ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1642:1: (lv_value_15_0= RULE_IDENT )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1642:1: (lv_value_15_0= RULE_IDENT )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1643:3: lv_value_15_0= RULE_IDENT
                    {
                    lv_value_15_0=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleLiteral3471); if (state.failed) return current;
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1660:6: ( () ( (lv_value_17_0= '?' ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1660:6: ( () ( (lv_value_17_0= '?' ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1660:7: () ( (lv_value_17_0= '?' ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1660:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1661:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getLiteralAccess().getUnknowLITERALAction_8_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1666:2: ( (lv_value_17_0= '?' ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1667:1: (lv_value_17_0= '?' )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1667:1: (lv_value_17_0= '?' )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1668:3: lv_value_17_0= '?'
                    {
                    lv_value_17_0=(Token)match(input,52,FOLLOW_52_in_ruleLiteral3511); if (state.failed) return current;
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1689:1: entryRuleINSTRUCTION returns [EObject current=null] : iv_ruleINSTRUCTION= ruleINSTRUCTION EOF ;
    public final EObject entryRuleINSTRUCTION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleINSTRUCTION = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1690:2: (iv_ruleINSTRUCTION= ruleINSTRUCTION EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1691:2: iv_ruleINSTRUCTION= ruleINSTRUCTION EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getINSTRUCTIONRule()); 
            }
            pushFollow(FOLLOW_ruleINSTRUCTION_in_entryRuleINSTRUCTION3561);
            iv_ruleINSTRUCTION=ruleINSTRUCTION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleINSTRUCTION; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleINSTRUCTION3571); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1698:1: ruleINSTRUCTION returns [EObject current=null] : (this_IF_INSTR_0= ruleIF_INSTR | this_LOOP_INSTR_1= ruleLOOP_INSTR | this_ASSIGN_INSTR_2= ruleASSIGN_INSTR | this_ERROR_INSTR_3= ruleERROR_INSTR | this_NULL_INSTR_4= ruleNULL_INSTR ) ;
    public final EObject ruleINSTRUCTION() throws RecognitionException {
        EObject current = null;

        EObject this_IF_INSTR_0 = null;

        EObject this_LOOP_INSTR_1 = null;

        EObject this_ASSIGN_INSTR_2 = null;

        EObject this_ERROR_INSTR_3 = null;

        EObject this_NULL_INSTR_4 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1701:28: ( (this_IF_INSTR_0= ruleIF_INSTR | this_LOOP_INSTR_1= ruleLOOP_INSTR | this_ASSIGN_INSTR_2= ruleASSIGN_INSTR | this_ERROR_INSTR_3= ruleERROR_INSTR | this_NULL_INSTR_4= ruleNULL_INSTR ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1702:1: (this_IF_INSTR_0= ruleIF_INSTR | this_LOOP_INSTR_1= ruleLOOP_INSTR | this_ASSIGN_INSTR_2= ruleASSIGN_INSTR | this_ERROR_INSTR_3= ruleERROR_INSTR | this_NULL_INSTR_4= ruleNULL_INSTR )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1702:1: (this_IF_INSTR_0= ruleIF_INSTR | this_LOOP_INSTR_1= ruleLOOP_INSTR | this_ASSIGN_INSTR_2= ruleASSIGN_INSTR | this_ERROR_INSTR_3= ruleERROR_INSTR | this_NULL_INSTR_4= ruleNULL_INSTR )
            int alt16=5;
            switch ( input.LA(1) ) {
            case 53:
                {
                alt16=1;
                }
                break;
            case 56:
                {
                alt16=2;
                }
                break;
            case RULE_IDENT:
            case RULE_BOOLEAN:
            case RULE_STRING:
            case RULE_ENUM_ELEMENT:
            case RULE_BIT:
            case RULE_HEX:
            case RULE_INT:
            case 40:
            case 68:
            case 71:
                {
                alt16=3;
                }
                break;
            case 57:
                {
                alt16=4;
                }
                break;
            case 58:
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1703:5: this_IF_INSTR_0= ruleIF_INSTR
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getIF_INSTRParserRuleCall_0()); 
                          
                    }
                    pushFollow(FOLLOW_ruleIF_INSTR_in_ruleINSTRUCTION3618);
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1713:5: this_LOOP_INSTR_1= ruleLOOP_INSTR
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getLOOP_INSTRParserRuleCall_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleLOOP_INSTR_in_ruleINSTRUCTION3645);
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1723:5: this_ASSIGN_INSTR_2= ruleASSIGN_INSTR
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getASSIGN_INSTRParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleASSIGN_INSTR_in_ruleINSTRUCTION3672);
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1733:5: this_ERROR_INSTR_3= ruleERROR_INSTR
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getERROR_INSTRParserRuleCall_3()); 
                          
                    }
                    pushFollow(FOLLOW_ruleERROR_INSTR_in_ruleINSTRUCTION3699);
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1743:5: this_NULL_INSTR_4= ruleNULL_INSTR
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getINSTRUCTIONAccess().getNULL_INSTRParserRuleCall_4()); 
                          
                    }
                    pushFollow(FOLLOW_ruleNULL_INSTR_in_ruleINSTRUCTION3726);
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1759:1: entryRuleIF_INSTR returns [EObject current=null] : iv_ruleIF_INSTR= ruleIF_INSTR EOF ;
    public final EObject entryRuleIF_INSTR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleIF_INSTR = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1760:2: (iv_ruleIF_INSTR= ruleIF_INSTR EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1761:2: iv_ruleIF_INSTR= ruleIF_INSTR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getIF_INSTRRule()); 
            }
            pushFollow(FOLLOW_ruleIF_INSTR_in_entryRuleIF_INSTR3761);
            iv_ruleIF_INSTR=ruleIF_INSTR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleIF_INSTR; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleIF_INSTR3771); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1768:1: ruleIF_INSTR returns [EObject current=null] : (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifcond_2_0= ruleEXPRESSION ) ) otherlv_3= ')' otherlv_4= '=>' otherlv_5= '{' ( (lv_ifst_6_0= ruleINSTRUCTION ) ) otherlv_7= '}' ( ( ( 'else' )=>otherlv_8= 'else' ) (otherlv_9= '=>' )? otherlv_10= '{' ( (lv_elst_11_0= ruleINSTRUCTION ) ) otherlv_12= '}' ) ) ;
    public final EObject ruleIF_INSTR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        EObject lv_ifcond_2_0 = null;

        EObject lv_ifst_6_0 = null;

        EObject lv_elst_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1771:28: ( (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifcond_2_0= ruleEXPRESSION ) ) otherlv_3= ')' otherlv_4= '=>' otherlv_5= '{' ( (lv_ifst_6_0= ruleINSTRUCTION ) ) otherlv_7= '}' ( ( ( 'else' )=>otherlv_8= 'else' ) (otherlv_9= '=>' )? otherlv_10= '{' ( (lv_elst_11_0= ruleINSTRUCTION ) ) otherlv_12= '}' ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1772:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifcond_2_0= ruleEXPRESSION ) ) otherlv_3= ')' otherlv_4= '=>' otherlv_5= '{' ( (lv_ifst_6_0= ruleINSTRUCTION ) ) otherlv_7= '}' ( ( ( 'else' )=>otherlv_8= 'else' ) (otherlv_9= '=>' )? otherlv_10= '{' ( (lv_elst_11_0= ruleINSTRUCTION ) ) otherlv_12= '}' ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1772:1: (otherlv_0= 'if' otherlv_1= '(' ( (lv_ifcond_2_0= ruleEXPRESSION ) ) otherlv_3= ')' otherlv_4= '=>' otherlv_5= '{' ( (lv_ifst_6_0= ruleINSTRUCTION ) ) otherlv_7= '}' ( ( ( 'else' )=>otherlv_8= 'else' ) (otherlv_9= '=>' )? otherlv_10= '{' ( (lv_elst_11_0= ruleINSTRUCTION ) ) otherlv_12= '}' ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1772:3: otherlv_0= 'if' otherlv_1= '(' ( (lv_ifcond_2_0= ruleEXPRESSION ) ) otherlv_3= ')' otherlv_4= '=>' otherlv_5= '{' ( (lv_ifst_6_0= ruleINSTRUCTION ) ) otherlv_7= '}' ( ( ( 'else' )=>otherlv_8= 'else' ) (otherlv_9= '=>' )? otherlv_10= '{' ( (lv_elst_11_0= ruleINSTRUCTION ) ) otherlv_12= '}' )
            {
            otherlv_0=(Token)match(input,53,FOLLOW_53_in_ruleIF_INSTR3808); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getIF_INSTRAccess().getIfKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleIF_INSTR3820); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getIF_INSTRAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1780:1: ( (lv_ifcond_2_0= ruleEXPRESSION ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1781:1: (lv_ifcond_2_0= ruleEXPRESSION )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1781:1: (lv_ifcond_2_0= ruleEXPRESSION )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1782:3: lv_ifcond_2_0= ruleEXPRESSION
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIF_INSTRAccess().getIfcondEXPRESSIONParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleIF_INSTR3841);
            lv_ifcond_2_0=ruleEXPRESSION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIF_INSTRRule());
              	        }
                     		set(
                     			current, 
                     			"ifcond",
                      		lv_ifcond_2_0, 
                      		"EXPRESSION");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleIF_INSTR3853); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_3, grammarAccess.getIF_INSTRAccess().getRightParenthesisKeyword_3());
                  
            }
            otherlv_4=(Token)match(input,54,FOLLOW_54_in_ruleIF_INSTR3865); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_4, grammarAccess.getIF_INSTRAccess().getEqualsSignGreaterThanSignKeyword_4());
                  
            }
            otherlv_5=(Token)match(input,17,FOLLOW_17_in_ruleIF_INSTR3877); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_5, grammarAccess.getIF_INSTRAccess().getLeftCurlyBracketKeyword_5());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1810:1: ( (lv_ifst_6_0= ruleINSTRUCTION ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1811:1: (lv_ifst_6_0= ruleINSTRUCTION )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1811:1: (lv_ifst_6_0= ruleINSTRUCTION )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1812:3: lv_ifst_6_0= ruleINSTRUCTION
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIF_INSTRAccess().getIfstINSTRUCTIONParserRuleCall_6_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleINSTRUCTION_in_ruleIF_INSTR3898);
            lv_ifst_6_0=ruleINSTRUCTION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIF_INSTRRule());
              	        }
                     		set(
                     			current, 
                     			"ifst",
                      		lv_ifst_6_0, 
                      		"INSTRUCTION");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_7=(Token)match(input,18,FOLLOW_18_in_ruleIF_INSTR3910); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_7, grammarAccess.getIF_INSTRAccess().getRightCurlyBracketKeyword_7());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1832:1: ( ( ( 'else' )=>otherlv_8= 'else' ) (otherlv_9= '=>' )? otherlv_10= '{' ( (lv_elst_11_0= ruleINSTRUCTION ) ) otherlv_12= '}' )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1832:2: ( ( 'else' )=>otherlv_8= 'else' ) (otherlv_9= '=>' )? otherlv_10= '{' ( (lv_elst_11_0= ruleINSTRUCTION ) ) otherlv_12= '}'
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1832:2: ( ( 'else' )=>otherlv_8= 'else' )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1832:3: ( 'else' )=>otherlv_8= 'else'
            {
            otherlv_8=(Token)match(input,55,FOLLOW_55_in_ruleIF_INSTR3931); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_8, grammarAccess.getIF_INSTRAccess().getElseKeyword_8_0());
                  
            }

            }

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1837:2: (otherlv_9= '=>' )?
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==54) ) {
                alt17=1;
            }
            switch (alt17) {
                case 1 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1837:4: otherlv_9= '=>'
                    {
                    otherlv_9=(Token)match(input,54,FOLLOW_54_in_ruleIF_INSTR3945); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_9, grammarAccess.getIF_INSTRAccess().getEqualsSignGreaterThanSignKeyword_8_1());
                          
                    }

                    }
                    break;

            }

            otherlv_10=(Token)match(input,17,FOLLOW_17_in_ruleIF_INSTR3959); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_10, grammarAccess.getIF_INSTRAccess().getLeftCurlyBracketKeyword_8_2());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1845:1: ( (lv_elst_11_0= ruleINSTRUCTION ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1846:1: (lv_elst_11_0= ruleINSTRUCTION )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1846:1: (lv_elst_11_0= ruleINSTRUCTION )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1847:3: lv_elst_11_0= ruleINSTRUCTION
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getIF_INSTRAccess().getElstINSTRUCTIONParserRuleCall_8_3_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleINSTRUCTION_in_ruleIF_INSTR3980);
            lv_elst_11_0=ruleINSTRUCTION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getIF_INSTRRule());
              	        }
                     		set(
                     			current, 
                     			"elst",
                      		lv_elst_11_0, 
                      		"INSTRUCTION");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_12=(Token)match(input,18,FOLLOW_18_in_ruleIF_INSTR3992); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_12, grammarAccess.getIF_INSTRAccess().getRightCurlyBracketKeyword_8_4());
                  
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1875:1: entryRuleLOOP_INSTR returns [EObject current=null] : iv_ruleLOOP_INSTR= ruleLOOP_INSTR EOF ;
    public final EObject entryRuleLOOP_INSTR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleLOOP_INSTR = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1876:2: (iv_ruleLOOP_INSTR= ruleLOOP_INSTR EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1877:2: iv_ruleLOOP_INSTR= ruleLOOP_INSTR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getLOOP_INSTRRule()); 
            }
            pushFollow(FOLLOW_ruleLOOP_INSTR_in_entryRuleLOOP_INSTR4029);
            iv_ruleLOOP_INSTR=ruleLOOP_INSTR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleLOOP_INSTR; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleLOOP_INSTR4039); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1884:1: ruleLOOP_INSTR returns [EObject current=null] : (otherlv_0= 'loop' otherlv_1= '(' ( (lv_val_2_0= RULE_INT ) ) otherlv_3= ')' ) ;
    public final EObject ruleLOOP_INSTR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_1=null;
        Token lv_val_2_0=null;
        Token otherlv_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1887:28: ( (otherlv_0= 'loop' otherlv_1= '(' ( (lv_val_2_0= RULE_INT ) ) otherlv_3= ')' ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1888:1: (otherlv_0= 'loop' otherlv_1= '(' ( (lv_val_2_0= RULE_INT ) ) otherlv_3= ')' )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1888:1: (otherlv_0= 'loop' otherlv_1= '(' ( (lv_val_2_0= RULE_INT ) ) otherlv_3= ')' )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1888:3: otherlv_0= 'loop' otherlv_1= '(' ( (lv_val_2_0= RULE_INT ) ) otherlv_3= ')'
            {
            otherlv_0=(Token)match(input,56,FOLLOW_56_in_ruleLOOP_INSTR4076); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getLOOP_INSTRAccess().getLoopKeyword_0());
                  
            }
            otherlv_1=(Token)match(input,40,FOLLOW_40_in_ruleLOOP_INSTR4088); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getLOOP_INSTRAccess().getLeftParenthesisKeyword_1());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1896:1: ( (lv_val_2_0= RULE_INT ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1897:1: (lv_val_2_0= RULE_INT )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1897:1: (lv_val_2_0= RULE_INT )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1898:3: lv_val_2_0= RULE_INT
            {
            lv_val_2_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleLOOP_INSTR4105); if (state.failed) return current;
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

            otherlv_3=(Token)match(input,41,FOLLOW_41_in_ruleLOOP_INSTR4122); if (state.failed) return current;
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1926:1: entryRuleERROR_INSTR returns [EObject current=null] : iv_ruleERROR_INSTR= ruleERROR_INSTR EOF ;
    public final EObject entryRuleERROR_INSTR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleERROR_INSTR = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1927:2: (iv_ruleERROR_INSTR= ruleERROR_INSTR EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1928:2: iv_ruleERROR_INSTR= ruleERROR_INSTR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getERROR_INSTRRule()); 
            }
            pushFollow(FOLLOW_ruleERROR_INSTR_in_entryRuleERROR_INSTR4158);
            iv_ruleERROR_INSTR=ruleERROR_INSTR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleERROR_INSTR; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleERROR_INSTR4168); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1935:1: ruleERROR_INSTR returns [EObject current=null] : (otherlv_0= 'error' ( (lv_end_1_0= ruleEND ) ) ) ;
    public final EObject ruleERROR_INSTR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_end_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1938:28: ( (otherlv_0= 'error' ( (lv_end_1_0= ruleEND ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1939:1: (otherlv_0= 'error' ( (lv_end_1_0= ruleEND ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1939:1: (otherlv_0= 'error' ( (lv_end_1_0= ruleEND ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1939:3: otherlv_0= 'error' ( (lv_end_1_0= ruleEND ) )
            {
            otherlv_0=(Token)match(input,57,FOLLOW_57_in_ruleERROR_INSTR4205); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getERROR_INSTRAccess().getErrorKeyword_0());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1943:1: ( (lv_end_1_0= ruleEND ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1944:1: (lv_end_1_0= ruleEND )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1944:1: (lv_end_1_0= ruleEND )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1945:3: lv_end_1_0= ruleEND
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getERROR_INSTRAccess().getEndENDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEND_in_ruleERROR_INSTR4226);
            lv_end_1_0=ruleEND();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getERROR_INSTRRule());
              	        }
                     		set(
                     			current, 
                     			"end",
                      		lv_end_1_0, 
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1969:1: entryRuleNULL_INSTR returns [EObject current=null] : iv_ruleNULL_INSTR= ruleNULL_INSTR EOF ;
    public final EObject entryRuleNULL_INSTR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleNULL_INSTR = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1970:2: (iv_ruleNULL_INSTR= ruleNULL_INSTR EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1971:2: iv_ruleNULL_INSTR= ruleNULL_INSTR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getNULL_INSTRRule()); 
            }
            pushFollow(FOLLOW_ruleNULL_INSTR_in_entryRuleNULL_INSTR4262);
            iv_ruleNULL_INSTR=ruleNULL_INSTR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleNULL_INSTR; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleNULL_INSTR4272); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1978:1: ruleNULL_INSTR returns [EObject current=null] : (otherlv_0= 'null' ( (lv_end_1_0= ruleEND ) ) ) ;
    public final EObject ruleNULL_INSTR() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        EObject lv_end_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1981:28: ( (otherlv_0= 'null' ( (lv_end_1_0= ruleEND ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1982:1: (otherlv_0= 'null' ( (lv_end_1_0= ruleEND ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1982:1: (otherlv_0= 'null' ( (lv_end_1_0= ruleEND ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1982:3: otherlv_0= 'null' ( (lv_end_1_0= ruleEND ) )
            {
            otherlv_0=(Token)match(input,58,FOLLOW_58_in_ruleNULL_INSTR4309); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_0, grammarAccess.getNULL_INSTRAccess().getNullKeyword_0());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1986:1: ( (lv_end_1_0= ruleEND ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1987:1: (lv_end_1_0= ruleEND )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1987:1: (lv_end_1_0= ruleEND )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:1988:3: lv_end_1_0= ruleEND
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getNULL_INSTRAccess().getEndENDParserRuleCall_1_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEND_in_ruleNULL_INSTR4330);
            lv_end_1_0=ruleEND();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getNULL_INSTRRule());
              	        }
                     		set(
                     			current, 
                     			"end",
                      		lv_end_1_0, 
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2012:1: entryRuleASSIGN_INSTR returns [EObject current=null] : iv_ruleASSIGN_INSTR= ruleASSIGN_INSTR EOF ;
    public final EObject entryRuleASSIGN_INSTR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleASSIGN_INSTR = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2013:2: (iv_ruleASSIGN_INSTR= ruleASSIGN_INSTR EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2014:2: iv_ruleASSIGN_INSTR= ruleASSIGN_INSTR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getASSIGN_INSTRRule()); 
            }
            pushFollow(FOLLOW_ruleASSIGN_INSTR_in_entryRuleASSIGN_INSTR4366);
            iv_ruleASSIGN_INSTR=ruleASSIGN_INSTR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleASSIGN_INSTR; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleASSIGN_INSTR4376); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2021:1: ruleASSIGN_INSTR returns [EObject current=null] : ( ( (lv_sa_0_0= ruleSINGLE_ASSIGN ) ) (otherlv_1= ',' ( (lv_sa_2_0= ruleSINGLE_ASSIGN ) ) )* ( (lv_end_3_0= ruleEND ) ) ) ;
    public final EObject ruleASSIGN_INSTR() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_sa_0_0 = null;

        EObject lv_sa_2_0 = null;

        EObject lv_end_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2024:28: ( ( ( (lv_sa_0_0= ruleSINGLE_ASSIGN ) ) (otherlv_1= ',' ( (lv_sa_2_0= ruleSINGLE_ASSIGN ) ) )* ( (lv_end_3_0= ruleEND ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2025:1: ( ( (lv_sa_0_0= ruleSINGLE_ASSIGN ) ) (otherlv_1= ',' ( (lv_sa_2_0= ruleSINGLE_ASSIGN ) ) )* ( (lv_end_3_0= ruleEND ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2025:1: ( ( (lv_sa_0_0= ruleSINGLE_ASSIGN ) ) (otherlv_1= ',' ( (lv_sa_2_0= ruleSINGLE_ASSIGN ) ) )* ( (lv_end_3_0= ruleEND ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2025:2: ( (lv_sa_0_0= ruleSINGLE_ASSIGN ) ) (otherlv_1= ',' ( (lv_sa_2_0= ruleSINGLE_ASSIGN ) ) )* ( (lv_end_3_0= ruleEND ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2025:2: ( (lv_sa_0_0= ruleSINGLE_ASSIGN ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2026:1: (lv_sa_0_0= ruleSINGLE_ASSIGN )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2026:1: (lv_sa_0_0= ruleSINGLE_ASSIGN )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2027:3: lv_sa_0_0= ruleSINGLE_ASSIGN
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getASSIGN_INSTRAccess().getSaSINGLE_ASSIGNParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleSINGLE_ASSIGN_in_ruleASSIGN_INSTR4422);
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

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2043:2: (otherlv_1= ',' ( (lv_sa_2_0= ruleSINGLE_ASSIGN ) ) )*
            loop18:
            do {
                int alt18=2;
                int LA18_0 = input.LA(1);

                if ( (LA18_0==26) ) {
                    alt18=1;
                }


                switch (alt18) {
            	case 1 :
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2043:4: otherlv_1= ',' ( (lv_sa_2_0= ruleSINGLE_ASSIGN ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FOLLOW_26_in_ruleASSIGN_INSTR4435); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_1, grammarAccess.getASSIGN_INSTRAccess().getCommaKeyword_1_0());
            	          
            	    }
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2047:1: ( (lv_sa_2_0= ruleSINGLE_ASSIGN ) )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2048:1: (lv_sa_2_0= ruleSINGLE_ASSIGN )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2048:1: (lv_sa_2_0= ruleSINGLE_ASSIGN )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2049:3: lv_sa_2_0= ruleSINGLE_ASSIGN
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getASSIGN_INSTRAccess().getSaSINGLE_ASSIGNParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleSINGLE_ASSIGN_in_ruleASSIGN_INSTR4456);
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

            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2065:4: ( (lv_end_3_0= ruleEND ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2066:1: (lv_end_3_0= ruleEND )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2066:1: (lv_end_3_0= ruleEND )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2067:3: lv_end_3_0= ruleEND
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getASSIGN_INSTRAccess().getEndENDParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEND_in_ruleASSIGN_INSTR4479);
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2091:1: entryRuleSINGLE_ASSIGN returns [EObject current=null] : iv_ruleSINGLE_ASSIGN= ruleSINGLE_ASSIGN EOF ;
    public final EObject entryRuleSINGLE_ASSIGN() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSINGLE_ASSIGN = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2092:2: (iv_ruleSINGLE_ASSIGN= ruleSINGLE_ASSIGN EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2093:2: iv_ruleSINGLE_ASSIGN= ruleSINGLE_ASSIGN EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getSINGLE_ASSIGNRule()); 
            }
            pushFollow(FOLLOW_ruleSINGLE_ASSIGN_in_entryRuleSINGLE_ASSIGN4515);
            iv_ruleSINGLE_ASSIGN=ruleSINGLE_ASSIGN();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleSINGLE_ASSIGN; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleSINGLE_ASSIGN4525); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2100:1: ruleSINGLE_ASSIGN returns [EObject current=null] : ( ( (lv_left_0_0= ruleEXPRESSION ) ) otherlv_1= '=' ( (lv_right_2_0= ruleEXPRESSION ) ) ) ;
    public final EObject ruleSINGLE_ASSIGN() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_left_0_0 = null;

        EObject lv_right_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2103:28: ( ( ( (lv_left_0_0= ruleEXPRESSION ) ) otherlv_1= '=' ( (lv_right_2_0= ruleEXPRESSION ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2104:1: ( ( (lv_left_0_0= ruleEXPRESSION ) ) otherlv_1= '=' ( (lv_right_2_0= ruleEXPRESSION ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2104:1: ( ( (lv_left_0_0= ruleEXPRESSION ) ) otherlv_1= '=' ( (lv_right_2_0= ruleEXPRESSION ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2104:2: ( (lv_left_0_0= ruleEXPRESSION ) ) otherlv_1= '=' ( (lv_right_2_0= ruleEXPRESSION ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2104:2: ( (lv_left_0_0= ruleEXPRESSION ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2105:1: (lv_left_0_0= ruleEXPRESSION )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2105:1: (lv_left_0_0= ruleEXPRESSION )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2106:3: lv_left_0_0= ruleEXPRESSION
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSINGLE_ASSIGNAccess().getLeftEXPRESSIONParserRuleCall_0_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleSINGLE_ASSIGN4571);
            lv_left_0_0=ruleEXPRESSION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSINGLE_ASSIGNRule());
              	        }
                     		set(
                     			current, 
                     			"left",
                      		lv_left_0_0, 
                      		"EXPRESSION");
              	        afterParserOrEnumRuleCall();
              	    
            }

            }


            }

            otherlv_1=(Token)match(input,59,FOLLOW_59_in_ruleSINGLE_ASSIGN4583); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                  	newLeafNode(otherlv_1, grammarAccess.getSINGLE_ASSIGNAccess().getEqualsSignKeyword_1());
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2126:1: ( (lv_right_2_0= ruleEXPRESSION ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2127:1: (lv_right_2_0= ruleEXPRESSION )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2127:1: (lv_right_2_0= ruleEXPRESSION )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2128:3: lv_right_2_0= ruleEXPRESSION
            {
            if ( state.backtracking==0 ) {
               
              	        newCompositeNode(grammarAccess.getSINGLE_ASSIGNAccess().getRightEXPRESSIONParserRuleCall_2_0()); 
              	    
            }
            pushFollow(FOLLOW_ruleEXPRESSION_in_ruleSINGLE_ASSIGN4604);
            lv_right_2_0=ruleEXPRESSION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {

              	        if (current==null) {
              	            current = createModelElementForParent(grammarAccess.getSINGLE_ASSIGNRule());
              	        }
                     		set(
                     			current, 
                     			"right",
                      		lv_right_2_0, 
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2152:1: entryRuleEXPRESSION returns [EObject current=null] : iv_ruleEXPRESSION= ruleEXPRESSION EOF ;
    public final EObject entryRuleEXPRESSION() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEXPRESSION = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2153:2: (iv_ruleEXPRESSION= ruleEXPRESSION EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2154:2: iv_ruleEXPRESSION= ruleEXPRESSION EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEXPRESSIONRule()); 
            }
            pushFollow(FOLLOW_ruleEXPRESSION_in_entryRuleEXPRESSION4640);
            iv_ruleEXPRESSION=ruleEXPRESSION();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEXPRESSION; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEXPRESSION4650); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2161:1: ruleEXPRESSION returns [EObject current=null] : this_OR_0= ruleOR ;
    public final EObject ruleEXPRESSION() throws RecognitionException {
        EObject current = null;

        EObject this_OR_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2164:28: (this_OR_0= ruleOR )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2166:5: this_OR_0= ruleOR
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEXPRESSIONAccess().getORParserRuleCall()); 
                  
            }
            pushFollow(FOLLOW_ruleOR_in_ruleEXPRESSION4696);
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2182:1: entryRuleOR returns [EObject current=null] : iv_ruleOR= ruleOR EOF ;
    public final EObject entryRuleOR() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOR = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2183:2: (iv_ruleOR= ruleOR EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2184:2: iv_ruleOR= ruleOR EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getORRule()); 
            }
            pushFollow(FOLLOW_ruleOR_in_entryRuleOR4730);
            iv_ruleOR=ruleOR();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleOR; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleOR4740); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2191:1: ruleOR returns [EObject current=null] : (this_AND_0= ruleAND ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAND ) ) )* ) ;
    public final EObject ruleOR() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_AND_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2194:28: ( (this_AND_0= ruleAND ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAND ) ) )* ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2195:1: (this_AND_0= ruleAND ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAND ) ) )* )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2195:1: (this_AND_0= ruleAND ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAND ) ) )* )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2196:5: this_AND_0= ruleAND ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAND ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getORAccess().getANDParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleAND_in_ruleOR4787);
            this_AND_0=ruleAND();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_AND_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2204:1: ( () otherlv_2= 'or' ( (lv_right_3_0= ruleAND ) ) )*
            loop19:
            do {
                int alt19=2;
                int LA19_0 = input.LA(1);

                if ( (LA19_0==60) ) {
                    alt19=1;
                }


                switch (alt19) {
            	case 1 :
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2204:2: () otherlv_2= 'or' ( (lv_right_3_0= ruleAND ) )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2204:2: ()
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2205:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getORAccess().getORLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,60,FOLLOW_60_in_ruleOR4808); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getORAccess().getOrKeyword_1_1());
            	          
            	    }
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2214:1: ( (lv_right_3_0= ruleAND ) )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2215:1: (lv_right_3_0= ruleAND )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2215:1: (lv_right_3_0= ruleAND )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2216:3: lv_right_3_0= ruleAND
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getORAccess().getRightANDParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleAND_in_ruleOR4829);
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2240:1: entryRuleAND returns [EObject current=null] : iv_ruleAND= ruleAND EOF ;
    public final EObject entryRuleAND() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAND = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2241:2: (iv_ruleAND= ruleAND EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2242:2: iv_ruleAND= ruleAND EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getANDRule()); 
            }
            pushFollow(FOLLOW_ruleAND_in_entryRuleAND4867);
            iv_ruleAND=ruleAND();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAND; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAND4877); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2249:1: ruleAND returns [EObject current=null] : (this_EQUAL_DIFF_0= ruleEQUAL_DIFF ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEQUAL_DIFF ) ) )* ) ;
    public final EObject ruleAND() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        EObject this_EQUAL_DIFF_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2252:28: ( (this_EQUAL_DIFF_0= ruleEQUAL_DIFF ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEQUAL_DIFF ) ) )* ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2253:1: (this_EQUAL_DIFF_0= ruleEQUAL_DIFF ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEQUAL_DIFF ) ) )* )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2253:1: (this_EQUAL_DIFF_0= ruleEQUAL_DIFF ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEQUAL_DIFF ) ) )* )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2254:5: this_EQUAL_DIFF_0= ruleEQUAL_DIFF ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEQUAL_DIFF ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getANDAccess().getEQUAL_DIFFParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleEQUAL_DIFF_in_ruleAND4924);
            this_EQUAL_DIFF_0=ruleEQUAL_DIFF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_EQUAL_DIFF_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2262:1: ( () otherlv_2= 'and' ( (lv_right_3_0= ruleEQUAL_DIFF ) ) )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==61) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2262:2: () otherlv_2= 'and' ( (lv_right_3_0= ruleEQUAL_DIFF ) )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2262:2: ()
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2263:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getANDAccess().getANDLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    otherlv_2=(Token)match(input,61,FOLLOW_61_in_ruleAND4945); if (state.failed) return current;
            	    if ( state.backtracking==0 ) {

            	          	newLeafNode(otherlv_2, grammarAccess.getANDAccess().getAndKeyword_1_1());
            	          
            	    }
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2272:1: ( (lv_right_3_0= ruleEQUAL_DIFF ) )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2273:1: (lv_right_3_0= ruleEQUAL_DIFF )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2273:1: (lv_right_3_0= ruleEQUAL_DIFF )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2274:3: lv_right_3_0= ruleEQUAL_DIFF
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getANDAccess().getRightEQUAL_DIFFParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleEQUAL_DIFF_in_ruleAND4966);
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2298:1: entryRuleEQUAL_DIFF returns [EObject current=null] : iv_ruleEQUAL_DIFF= ruleEQUAL_DIFF EOF ;
    public final EObject entryRuleEQUAL_DIFF() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleEQUAL_DIFF = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2299:2: (iv_ruleEQUAL_DIFF= ruleEQUAL_DIFF EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2300:2: iv_ruleEQUAL_DIFF= ruleEQUAL_DIFF EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getEQUAL_DIFFRule()); 
            }
            pushFollow(FOLLOW_ruleEQUAL_DIFF_in_entryRuleEQUAL_DIFF5004);
            iv_ruleEQUAL_DIFF=ruleEQUAL_DIFF();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleEQUAL_DIFF; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleEQUAL_DIFF5014); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2307:1: ruleEQUAL_DIFF returns [EObject current=null] : (this_COMPARISON_0= ruleCOMPARISON ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleCOMPARISON ) ) )* ) ;
    public final EObject ruleEQUAL_DIFF() throws RecognitionException {
        EObject current = null;

        Token lv_op_2_1=null;
        Token lv_op_2_2=null;
        EObject this_COMPARISON_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2310:28: ( (this_COMPARISON_0= ruleCOMPARISON ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleCOMPARISON ) ) )* ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2311:1: (this_COMPARISON_0= ruleCOMPARISON ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleCOMPARISON ) ) )* )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2311:1: (this_COMPARISON_0= ruleCOMPARISON ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleCOMPARISON ) ) )* )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2312:5: this_COMPARISON_0= ruleCOMPARISON ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleCOMPARISON ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getEQUAL_DIFFAccess().getCOMPARISONParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleCOMPARISON_in_ruleEQUAL_DIFF5061);
            this_COMPARISON_0=ruleCOMPARISON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_COMPARISON_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2320:1: ( () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleCOMPARISON ) ) )*
            loop22:
            do {
                int alt22=2;
                int LA22_0 = input.LA(1);

                if ( (LA22_0==39||LA22_0==62) ) {
                    alt22=1;
                }


                switch (alt22) {
            	case 1 :
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2320:2: () ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) ) ( (lv_right_3_0= ruleCOMPARISON ) )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2320:2: ()
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2321:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getEQUAL_DIFFAccess().getEQUAL_DIFFLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2326:2: ( ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) ) )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2327:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2327:1: ( (lv_op_2_1= '==' | lv_op_2_2= '!=' ) )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2328:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2328:1: (lv_op_2_1= '==' | lv_op_2_2= '!=' )
            	    int alt21=2;
            	    int LA21_0 = input.LA(1);

            	    if ( (LA21_0==39) ) {
            	        alt21=1;
            	    }
            	    else if ( (LA21_0==62) ) {
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
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2329:3: lv_op_2_1= '=='
            	            {
            	            lv_op_2_1=(Token)match(input,39,FOLLOW_39_in_ruleEQUAL_DIFF5090); if (state.failed) return current;
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
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2341:8: lv_op_2_2= '!='
            	            {
            	            lv_op_2_2=(Token)match(input,62,FOLLOW_62_in_ruleEQUAL_DIFF5119); if (state.failed) return current;
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

            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2356:2: ( (lv_right_3_0= ruleCOMPARISON ) )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2357:1: (lv_right_3_0= ruleCOMPARISON )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2357:1: (lv_right_3_0= ruleCOMPARISON )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2358:3: lv_right_3_0= ruleCOMPARISON
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getEQUAL_DIFFAccess().getRightCOMPARISONParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleCOMPARISON_in_ruleEQUAL_DIFF5156);
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2382:1: entryRuleCOMPARISON returns [EObject current=null] : iv_ruleCOMPARISON= ruleCOMPARISON EOF ;
    public final EObject entryRuleCOMPARISON() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCOMPARISON = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2383:2: (iv_ruleCOMPARISON= ruleCOMPARISON EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2384:2: iv_ruleCOMPARISON= ruleCOMPARISON EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getCOMPARISONRule()); 
            }
            pushFollow(FOLLOW_ruleCOMPARISON_in_entryRuleCOMPARISON5194);
            iv_ruleCOMPARISON=ruleCOMPARISON();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleCOMPARISON; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleCOMPARISON5204); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2391:1: ruleCOMPARISON returns [EObject current=null] : (this_ADD_SUB_0= ruleADD_SUB ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleADD_SUB ) ) )* ) ;
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
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2394:28: ( (this_ADD_SUB_0= ruleADD_SUB ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleADD_SUB ) ) )* ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2395:1: (this_ADD_SUB_0= ruleADD_SUB ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleADD_SUB ) ) )* )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2395:1: (this_ADD_SUB_0= ruleADD_SUB ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleADD_SUB ) ) )* )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2396:5: this_ADD_SUB_0= ruleADD_SUB ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleADD_SUB ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getCOMPARISONAccess().getADD_SUBParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleADD_SUB_in_ruleCOMPARISON5251);
            this_ADD_SUB_0=ruleADD_SUB();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_ADD_SUB_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2404:1: ( () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleADD_SUB ) ) )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( ((LA24_0>=63 && LA24_0<=66)) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2404:2: () ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) ) ( (lv_right_3_0= ruleADD_SUB ) )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2404:2: ()
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2405:5: 
            	    {
            	    if ( state.backtracking==0 ) {

            	              current = forceCreateModelElementAndSet(
            	                  grammarAccess.getCOMPARISONAccess().getCOMPARISONLeftAction_1_0(),
            	                  current);
            	          
            	    }

            	    }

            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2410:2: ( ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) ) )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2411:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2411:1: ( (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' ) )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2412:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2412:1: (lv_op_2_1= '<' | lv_op_2_2= '<=' | lv_op_2_3= '>' | lv_op_2_4= '>=' )
            	    int alt23=4;
            	    switch ( input.LA(1) ) {
            	    case 63:
            	        {
            	        alt23=1;
            	        }
            	        break;
            	    case 64:
            	        {
            	        alt23=2;
            	        }
            	        break;
            	    case 65:
            	        {
            	        alt23=3;
            	        }
            	        break;
            	    case 66:
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
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2413:3: lv_op_2_1= '<'
            	            {
            	            lv_op_2_1=(Token)match(input,63,FOLLOW_63_in_ruleCOMPARISON5280); if (state.failed) return current;
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
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2425:8: lv_op_2_2= '<='
            	            {
            	            lv_op_2_2=(Token)match(input,64,FOLLOW_64_in_ruleCOMPARISON5309); if (state.failed) return current;
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
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2437:8: lv_op_2_3= '>'
            	            {
            	            lv_op_2_3=(Token)match(input,65,FOLLOW_65_in_ruleCOMPARISON5338); if (state.failed) return current;
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
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2449:8: lv_op_2_4= '>='
            	            {
            	            lv_op_2_4=(Token)match(input,66,FOLLOW_66_in_ruleCOMPARISON5367); if (state.failed) return current;
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

            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2464:2: ( (lv_right_3_0= ruleADD_SUB ) )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2465:1: (lv_right_3_0= ruleADD_SUB )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2465:1: (lv_right_3_0= ruleADD_SUB )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2466:3: lv_right_3_0= ruleADD_SUB
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getCOMPARISONAccess().getRightADD_SUBParserRuleCall_1_2_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleADD_SUB_in_ruleCOMPARISON5404);
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2490:1: entryRuleADD_SUB returns [EObject current=null] : iv_ruleADD_SUB= ruleADD_SUB EOF ;
    public final EObject entryRuleADD_SUB() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleADD_SUB = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2491:2: (iv_ruleADD_SUB= ruleADD_SUB EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2492:2: iv_ruleADD_SUB= ruleADD_SUB EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getADD_SUBRule()); 
            }
            pushFollow(FOLLOW_ruleADD_SUB_in_entryRuleADD_SUB5442);
            iv_ruleADD_SUB=ruleADD_SUB();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleADD_SUB; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleADD_SUB5452); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2499:1: ruleADD_SUB returns [EObject current=null] : (this_MULT_DIV_0= ruleMULT_DIV ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMULT_DIV ) ) )* ) ;
    public final EObject ruleADD_SUB() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_MULT_DIV_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2502:28: ( (this_MULT_DIV_0= ruleMULT_DIV ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMULT_DIV ) ) )* ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2503:1: (this_MULT_DIV_0= ruleMULT_DIV ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMULT_DIV ) ) )* )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2503:1: (this_MULT_DIV_0= ruleMULT_DIV ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMULT_DIV ) ) )* )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2504:5: this_MULT_DIV_0= ruleMULT_DIV ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMULT_DIV ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getADD_SUBAccess().getMULT_DIVParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_ruleMULT_DIV_in_ruleADD_SUB5499);
            this_MULT_DIV_0=ruleMULT_DIV();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_MULT_DIV_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2512:1: ( ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMULT_DIV ) ) )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( ((LA26_0>=67 && LA26_0<=68)) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2512:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) ) ( (lv_right_5_0= ruleMULT_DIV ) )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2512:2: ( ( () otherlv_2= '+' ) | ( () otherlv_4= '-' ) )
            	    int alt25=2;
            	    int LA25_0 = input.LA(1);

            	    if ( (LA25_0==67) ) {
            	        alt25=1;
            	    }
            	    else if ( (LA25_0==68) ) {
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
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2512:3: ( () otherlv_2= '+' )
            	            {
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2512:3: ( () otherlv_2= '+' )
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2512:4: () otherlv_2= '+'
            	            {
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2512:4: ()
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2513:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getADD_SUBAccess().getADDLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,67,FOLLOW_67_in_ruleADD_SUB5522); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getADD_SUBAccess().getPlusSignKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2523:6: ( () otherlv_4= '-' )
            	            {
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2523:6: ( () otherlv_4= '-' )
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2523:7: () otherlv_4= '-'
            	            {
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2523:7: ()
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2524:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getADD_SUBAccess().getSUBLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,68,FOLLOW_68_in_ruleADD_SUB5551); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getADD_SUBAccess().getHyphenMinusKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2533:3: ( (lv_right_5_0= ruleMULT_DIV ) )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2534:1: (lv_right_5_0= ruleMULT_DIV )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2534:1: (lv_right_5_0= ruleMULT_DIV )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2535:3: lv_right_5_0= ruleMULT_DIV
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getADD_SUBAccess().getRightMULT_DIVParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_ruleMULT_DIV_in_ruleADD_SUB5574);
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2559:1: entryRuleMULT_DIV returns [EObject current=null] : iv_ruleMULT_DIV= ruleMULT_DIV EOF ;
    public final EObject entryRuleMULT_DIV() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMULT_DIV = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2560:2: (iv_ruleMULT_DIV= ruleMULT_DIV EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2561:2: iv_ruleMULT_DIV= ruleMULT_DIV EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getMULT_DIVRule()); 
            }
            pushFollow(FOLLOW_ruleMULT_DIV_in_entryRuleMULT_DIV5612);
            iv_ruleMULT_DIV=ruleMULT_DIV();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleMULT_DIV; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleMULT_DIV5622); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2568:1: ruleMULT_DIV returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleMULT_DIV() throws RecognitionException {
        EObject current = null;

        Token otherlv_2=null;
        Token otherlv_4=null;
        EObject this_PrimaryExpression_0 = null;

        EObject lv_right_5_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2571:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2572:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2572:1: (this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )* )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2573:5: this_PrimaryExpression_0= rulePrimaryExpression ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            {
            if ( state.backtracking==0 ) {
               
                      newCompositeNode(grammarAccess.getMULT_DIVAccess().getPrimaryExpressionParserRuleCall_0()); 
                  
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMULT_DIV5669);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               
                      current = this_PrimaryExpression_0; 
                      afterParserOrEnumRuleCall();
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2581:1: ( ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) ) )*
            loop28:
            do {
                int alt28=2;
                int LA28_0 = input.LA(1);

                if ( ((LA28_0>=69 && LA28_0<=70)) ) {
                    alt28=1;
                }


                switch (alt28) {
            	case 1 :
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2581:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) ) ( (lv_right_5_0= rulePrimaryExpression ) )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2581:2: ( ( () otherlv_2= '*' ) | ( () otherlv_4= '/' ) )
            	    int alt27=2;
            	    int LA27_0 = input.LA(1);

            	    if ( (LA27_0==69) ) {
            	        alt27=1;
            	    }
            	    else if ( (LA27_0==70) ) {
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
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2581:3: ( () otherlv_2= '*' )
            	            {
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2581:3: ( () otherlv_2= '*' )
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2581:4: () otherlv_2= '*'
            	            {
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2581:4: ()
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2582:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMULT_DIVAccess().getMULTLeftAction_1_0_0_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_2=(Token)match(input,69,FOLLOW_69_in_ruleMULT_DIV5692); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_2, grammarAccess.getMULT_DIVAccess().getAsteriskKeyword_1_0_0_1());
            	                  
            	            }

            	            }


            	            }
            	            break;
            	        case 2 :
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2592:6: ( () otherlv_4= '/' )
            	            {
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2592:6: ( () otherlv_4= '/' )
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2592:7: () otherlv_4= '/'
            	            {
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2592:7: ()
            	            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2593:5: 
            	            {
            	            if ( state.backtracking==0 ) {

            	                      current = forceCreateModelElementAndSet(
            	                          grammarAccess.getMULT_DIVAccess().getDIVLeftAction_1_0_1_0(),
            	                          current);
            	                  
            	            }

            	            }

            	            otherlv_4=(Token)match(input,70,FOLLOW_70_in_ruleMULT_DIV5721); if (state.failed) return current;
            	            if ( state.backtracking==0 ) {

            	                  	newLeafNode(otherlv_4, grammarAccess.getMULT_DIVAccess().getSolidusKeyword_1_0_1_1());
            	                  
            	            }

            	            }


            	            }
            	            break;

            	    }

            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2602:3: ( (lv_right_5_0= rulePrimaryExpression ) )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2603:1: (lv_right_5_0= rulePrimaryExpression )
            	    {
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2603:1: (lv_right_5_0= rulePrimaryExpression )
            	    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2604:3: lv_right_5_0= rulePrimaryExpression
            	    {
            	    if ( state.backtracking==0 ) {
            	       
            	      	        newCompositeNode(grammarAccess.getMULT_DIVAccess().getRightPrimaryExpressionParserRuleCall_1_1_0()); 
            	      	    
            	    }
            	    pushFollow(FOLLOW_rulePrimaryExpression_in_ruleMULT_DIV5744);
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2628:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2629:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2630:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            }
            pushFollow(FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression5782);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_rulePrimaryExpression; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRulePrimaryExpression5792); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2637:1: rulePrimaryExpression returns [EObject current=null] : ( (otherlv_0= '(' this_EXPRESSION_1= ruleEXPRESSION otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_exp_5_0= rulePrimaryExpression ) ) ) | this_Atomic_6= ruleAtomic ) ;
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
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2640:28: ( ( (otherlv_0= '(' this_EXPRESSION_1= ruleEXPRESSION otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_exp_5_0= rulePrimaryExpression ) ) ) | this_Atomic_6= ruleAtomic ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2641:1: ( (otherlv_0= '(' this_EXPRESSION_1= ruleEXPRESSION otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_exp_5_0= rulePrimaryExpression ) ) ) | this_Atomic_6= ruleAtomic )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2641:1: ( (otherlv_0= '(' this_EXPRESSION_1= ruleEXPRESSION otherlv_2= ')' ) | ( () otherlv_4= 'not' ( (lv_exp_5_0= rulePrimaryExpression ) ) ) | this_Atomic_6= ruleAtomic )
            int alt29=3;
            switch ( input.LA(1) ) {
            case 40:
                {
                alt29=1;
                }
                break;
            case 71:
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
            case 68:
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2641:2: (otherlv_0= '(' this_EXPRESSION_1= ruleEXPRESSION otherlv_2= ')' )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2641:2: (otherlv_0= '(' this_EXPRESSION_1= ruleEXPRESSION otherlv_2= ')' )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2641:4: otherlv_0= '(' this_EXPRESSION_1= ruleEXPRESSION otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,40,FOLLOW_40_in_rulePrimaryExpression5830); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_0, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_0_0());
                          
                    }
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getEXPRESSIONParserRuleCall_0_1()); 
                          
                    }
                    pushFollow(FOLLOW_ruleEXPRESSION_in_rulePrimaryExpression5852);
                    this_EXPRESSION_1=ruleEXPRESSION();

                    state._fsp--;
                    if (state.failed) return current;
                    if ( state.backtracking==0 ) {
                       
                              current = this_EXPRESSION_1; 
                              afterParserOrEnumRuleCall();
                          
                    }
                    otherlv_2=(Token)match(input,41,FOLLOW_41_in_rulePrimaryExpression5863); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_2, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_0_2());
                          
                    }

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2659:6: ( () otherlv_4= 'not' ( (lv_exp_5_0= rulePrimaryExpression ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2659:6: ( () otherlv_4= 'not' ( (lv_exp_5_0= rulePrimaryExpression ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2659:7: () otherlv_4= 'not' ( (lv_exp_5_0= rulePrimaryExpression ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2659:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2660:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getPrimaryExpressionAccess().getNOTAction_1_0(),
                                  current);
                          
                    }

                    }

                    otherlv_4=(Token)match(input,71,FOLLOW_71_in_rulePrimaryExpression5892); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                          	newLeafNode(otherlv_4, grammarAccess.getPrimaryExpressionAccess().getNotKeyword_1_1());
                          
                    }
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2669:1: ( (lv_exp_5_0= rulePrimaryExpression ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2670:1: (lv_exp_5_0= rulePrimaryExpression )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2670:1: (lv_exp_5_0= rulePrimaryExpression )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2671:3: lv_exp_5_0= rulePrimaryExpression
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getExpPrimaryExpressionParserRuleCall_1_2_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_rulePrimaryExpression_in_rulePrimaryExpression5913);
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2689:5: this_Atomic_6= ruleAtomic
                    {
                    if ( state.backtracking==0 ) {
                       
                              newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getAtomicParserRuleCall_2()); 
                          
                    }
                    pushFollow(FOLLOW_ruleAtomic_in_rulePrimaryExpression5942);
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2705:1: entryRuleAtomic returns [EObject current=null] : iv_ruleAtomic= ruleAtomic EOF ;
    public final EObject entryRuleAtomic() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtomic = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2706:2: (iv_ruleAtomic= ruleAtomic EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2707:2: iv_ruleAtomic= ruleAtomic EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getAtomicRule()); 
            }
            pushFollow(FOLLOW_ruleAtomic_in_entryRuleAtomic5977);
            iv_ruleAtomic=ruleAtomic();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleAtomic; 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleAtomic5987); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2714:1: ruleAtomic returns [EObject current=null] : ( ( () ( (lv_value_1_0= ruleINTEGER ) ) ) | ( () ( (lv_value_3_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_ENUM_ELEMENT ) ) ) | ( () ( (lv_value_9_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_11_0= RULE_BIT ) ) ) | ( () ( (lv_value_13_0= RULE_HEX ) ) ) | ( () ( (otherlv_15= RULE_IDENT ) ) ) ) ;
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
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2717:28: ( ( ( () ( (lv_value_1_0= ruleINTEGER ) ) ) | ( () ( (lv_value_3_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_ENUM_ELEMENT ) ) ) | ( () ( (lv_value_9_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_11_0= RULE_BIT ) ) ) | ( () ( (lv_value_13_0= RULE_HEX ) ) ) | ( () ( (otherlv_15= RULE_IDENT ) ) ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2718:1: ( ( () ( (lv_value_1_0= ruleINTEGER ) ) ) | ( () ( (lv_value_3_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_ENUM_ELEMENT ) ) ) | ( () ( (lv_value_9_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_11_0= RULE_BIT ) ) ) | ( () ( (lv_value_13_0= RULE_HEX ) ) ) | ( () ( (otherlv_15= RULE_IDENT ) ) ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2718:1: ( ( () ( (lv_value_1_0= ruleINTEGER ) ) ) | ( () ( (lv_value_3_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_ENUM_ELEMENT ) ) ) | ( () ( (lv_value_9_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_11_0= RULE_BIT ) ) ) | ( () ( (lv_value_13_0= RULE_HEX ) ) ) | ( () ( (otherlv_15= RULE_IDENT ) ) ) )
            int alt30=8;
            alt30 = dfa30.predict(input);
            switch (alt30) {
                case 1 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2718:2: ( () ( (lv_value_1_0= ruleINTEGER ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2718:2: ( () ( (lv_value_1_0= ruleINTEGER ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2718:3: () ( (lv_value_1_0= ruleINTEGER ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2718:3: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2719:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getIntConstantAction_0_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2724:2: ( (lv_value_1_0= ruleINTEGER ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2725:1: (lv_value_1_0= ruleINTEGER )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2725:1: (lv_value_1_0= ruleINTEGER )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2726:3: lv_value_1_0= ruleINTEGER
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicAccess().getValueINTEGERParserRuleCall_0_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleINTEGER_in_ruleAtomic6043);
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2743:6: ( () ( (lv_value_3_0= ruleDECIMAL ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2743:6: ( () ( (lv_value_3_0= ruleDECIMAL ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2743:7: () ( (lv_value_3_0= ruleDECIMAL ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2743:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2744:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getRealConstantAction_1_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2749:2: ( (lv_value_3_0= ruleDECIMAL ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2750:1: (lv_value_3_0= ruleDECIMAL )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2750:1: (lv_value_3_0= ruleDECIMAL )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2751:3: lv_value_3_0= ruleDECIMAL
                    {
                    if ( state.backtracking==0 ) {
                       
                      	        newCompositeNode(grammarAccess.getAtomicAccess().getValueDECIMALParserRuleCall_1_1_0()); 
                      	    
                    }
                    pushFollow(FOLLOW_ruleDECIMAL_in_ruleAtomic6081);
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2768:6: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2768:6: ( () ( (lv_value_5_0= RULE_STRING ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2768:7: () ( (lv_value_5_0= RULE_STRING ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2768:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2769:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getStrConstantAction_2_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2774:2: ( (lv_value_5_0= RULE_STRING ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2775:1: (lv_value_5_0= RULE_STRING )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2775:1: (lv_value_5_0= RULE_STRING )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2776:3: lv_value_5_0= RULE_STRING
                    {
                    lv_value_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleAtomic6115); if (state.failed) return current;
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2793:6: ( () ( (lv_value_7_0= RULE_ENUM_ELEMENT ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2793:6: ( () ( (lv_value_7_0= RULE_ENUM_ELEMENT ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2793:7: () ( (lv_value_7_0= RULE_ENUM_ELEMENT ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2793:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2794:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getEnumConstantAction_3_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2799:2: ( (lv_value_7_0= RULE_ENUM_ELEMENT ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2800:1: (lv_value_7_0= RULE_ENUM_ELEMENT )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2800:1: (lv_value_7_0= RULE_ENUM_ELEMENT )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2801:3: lv_value_7_0= RULE_ENUM_ELEMENT
                    {
                    lv_value_7_0=(Token)match(input,RULE_ENUM_ELEMENT,FOLLOW_RULE_ENUM_ELEMENT_in_ruleAtomic6154); if (state.failed) return current;
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2818:6: ( () ( (lv_value_9_0= RULE_BOOLEAN ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2818:6: ( () ( (lv_value_9_0= RULE_BOOLEAN ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2818:7: () ( (lv_value_9_0= RULE_BOOLEAN ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2818:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2819:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getBoolConstantAction_4_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2824:2: ( (lv_value_9_0= RULE_BOOLEAN ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2825:1: (lv_value_9_0= RULE_BOOLEAN )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2825:1: (lv_value_9_0= RULE_BOOLEAN )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2826:3: lv_value_9_0= RULE_BOOLEAN
                    {
                    lv_value_9_0=(Token)match(input,RULE_BOOLEAN,FOLLOW_RULE_BOOLEAN_in_ruleAtomic6193); if (state.failed) return current;
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2843:6: ( () ( (lv_value_11_0= RULE_BIT ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2843:6: ( () ( (lv_value_11_0= RULE_BIT ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2843:7: () ( (lv_value_11_0= RULE_BIT ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2843:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2844:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getBitConstantAction_5_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2849:2: ( (lv_value_11_0= RULE_BIT ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2850:1: (lv_value_11_0= RULE_BIT )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2850:1: (lv_value_11_0= RULE_BIT )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2851:3: lv_value_11_0= RULE_BIT
                    {
                    lv_value_11_0=(Token)match(input,RULE_BIT,FOLLOW_RULE_BIT_in_ruleAtomic6232); if (state.failed) return current;
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2868:6: ( () ( (lv_value_13_0= RULE_HEX ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2868:6: ( () ( (lv_value_13_0= RULE_HEX ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2868:7: () ( (lv_value_13_0= RULE_HEX ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2868:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2869:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getHexConstantAction_6_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2874:2: ( (lv_value_13_0= RULE_HEX ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2875:1: (lv_value_13_0= RULE_HEX )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2875:1: (lv_value_13_0= RULE_HEX )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2876:3: lv_value_13_0= RULE_HEX
                    {
                    lv_value_13_0=(Token)match(input,RULE_HEX,FOLLOW_RULE_HEX_in_ruleAtomic6271); if (state.failed) return current;
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
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2893:6: ( () ( (otherlv_15= RULE_IDENT ) ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2893:6: ( () ( (otherlv_15= RULE_IDENT ) ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2893:7: () ( (otherlv_15= RULE_IDENT ) )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2893:7: ()
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2894:5: 
                    {
                    if ( state.backtracking==0 ) {

                              current = forceCreateModelElement(
                                  grammarAccess.getAtomicAccess().getVarExpRefAction_7_0(),
                                  current);
                          
                    }

                    }

                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2899:2: ( (otherlv_15= RULE_IDENT ) )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2900:1: (otherlv_15= RULE_IDENT )
                    {
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2900:1: (otherlv_15= RULE_IDENT )
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2901:3: otherlv_15= RULE_IDENT
                    {
                    if ( state.backtracking==0 ) {

                      			if (current==null) {
                      	            current = createModelElement(grammarAccess.getAtomicRule());
                      	        }
                              
                    }
                    otherlv_15=(Token)match(input,RULE_IDENT,FOLLOW_RULE_IDENT_in_ruleAtomic6313); if (state.failed) return current;
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2920:1: entryRuleDECIMAL returns [String current=null] : iv_ruleDECIMAL= ruleDECIMAL EOF ;
    public final String entryRuleDECIMAL() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleDECIMAL = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2921:2: (iv_ruleDECIMAL= ruleDECIMAL EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2922:2: iv_ruleDECIMAL= ruleDECIMAL EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getDECIMALRule()); 
            }
            pushFollow(FOLLOW_ruleDECIMAL_in_entryRuleDECIMAL6351);
            iv_ruleDECIMAL=ruleDECIMAL();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleDECIMAL.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleDECIMAL6362); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2929:1: ruleDECIMAL returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT ) ) ;
    public final AntlrDatatypeRuleToken ruleDECIMAL() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;
        Token this_INT_3=null;

         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2932:28: ( ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT ) ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2933:1: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT ) )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2933:1: ( (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2933:2: (kw= '-' )? this_INT_1= RULE_INT (kw= '.' this_INT_3= RULE_INT )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2933:2: (kw= '-' )?
            int alt31=2;
            int LA31_0 = input.LA(1);

            if ( (LA31_0==68) ) {
                alt31=1;
            }
            switch (alt31) {
                case 1 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2934:2: kw= '-'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleDECIMAL6401); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getDECIMALAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDECIMAL6418); if (state.failed) return current;
            if ( state.backtracking==0 ) {

              		current.merge(this_INT_1);
                  
            }
            if ( state.backtracking==0 ) {
               
                  newLeafNode(this_INT_1, grammarAccess.getDECIMALAccess().getINTTerminalRuleCall_1()); 
                  
            }
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2946:1: (kw= '.' this_INT_3= RULE_INT )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2947:2: kw= '.' this_INT_3= RULE_INT
            {
            kw=(Token)match(input,72,FOLLOW_72_in_ruleDECIMAL6437); if (state.failed) return current;
            if ( state.backtracking==0 ) {

                      current.merge(kw);
                      newLeafNode(kw, grammarAccess.getDECIMALAccess().getFullStopKeyword_2_0()); 
                  
            }
            this_INT_3=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleDECIMAL6452); if (state.failed) return current;
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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2967:1: entryRuleINTEGER returns [String current=null] : iv_ruleINTEGER= ruleINTEGER EOF ;
    public final String entryRuleINTEGER() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleINTEGER = null;


        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2968:2: (iv_ruleINTEGER= ruleINTEGER EOF )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2969:2: iv_ruleINTEGER= ruleINTEGER EOF
            {
            if ( state.backtracking==0 ) {
               newCompositeNode(grammarAccess.getINTEGERRule()); 
            }
            pushFollow(FOLLOW_ruleINTEGER_in_entryRuleINTEGER6499);
            iv_ruleINTEGER=ruleINTEGER();

            state._fsp--;
            if (state.failed) return current;
            if ( state.backtracking==0 ) {
               current =iv_ruleINTEGER.getText(); 
            }
            match(input,EOF,FOLLOW_EOF_in_entryRuleINTEGER6510); if (state.failed) return current;

            }

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
    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2976:1: ruleINTEGER returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleINTEGER() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2979:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2980:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2980:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2980:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2980:2: (kw= '-' )?
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==68) ) {
                alt32=1;
            }
            switch (alt32) {
                case 1 :
                    // ../org.xtext.module.dsl/src-gen/org/xtext/parser/antlr/internal/InternalModuleDsl.g:2981:2: kw= '-'
                    {
                    kw=(Token)match(input,68,FOLLOW_68_in_ruleINTEGER6549); if (state.failed) return current;
                    if ( state.backtracking==0 ) {

                              current.merge(kw);
                              newLeafNode(kw, grammarAccess.getINTEGERAccess().getHyphenMinusKeyword_0()); 
                          
                    }

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleINTEGER6566); if (state.failed) return current;
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
        "\2\uffff\1\13\11\uffff";
    static final String DFA15_minS =
        "\1\4\1\12\1\22\11\uffff";
    static final String DFA15_maxS =
        "\1\104\1\12\1\110\11\uffff";
    static final String DFA15_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\11\1\2\1\1";
    static final String DFA15_specialS =
        "\14\uffff}>";
    static final String[] DFA15_transitionS = {
            "\1\10\1\3\1\4\1\5\1\6\1\7\1\2\51\uffff\1\11\17\uffff\1\1",
            "\1\2",
            "\1\13\7\uffff\1\13\16\uffff\1\13\7\uffff\3\13\24\uffff\1\12",
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
            return "1460:1: ( ( () ( (lv_value_1_0= ruleINTEGER ) ) ) | ( () ( (lv_value_3_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_5_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_7_0= RULE_STRING ) ) ) | ( () ( (lv_value_9_0= RULE_ENUM_ELEMENT ) ) ) | ( () ( (lv_value_11_0= RULE_BIT ) ) ) | ( () ( (lv_value_13_0= RULE_HEX ) ) ) | ( () ( (lv_value_15_0= RULE_IDENT ) ) ) | ( () ( (lv_value_17_0= '?' ) ) ) )";
        }
    }
    static final String DFA30_eotS =
        "\13\uffff";
    static final String DFA30_eofS =
        "\2\uffff\1\11\10\uffff";
    static final String DFA30_minS =
        "\1\4\1\12\1\32\10\uffff";
    static final String DFA30_maxS =
        "\1\104\1\12\1\110\10\uffff";
    static final String DFA30_acceptS =
        "\3\uffff\1\3\1\4\1\5\1\6\1\7\1\10\1\1\1\2";
    static final String DFA30_specialS =
        "\13\uffff}>";
    static final String[] DFA30_transitionS = {
            "\1\10\1\5\1\3\1\4\1\6\1\7\1\2\71\uffff\1\1",
            "\1\2",
            "\2\11\13\uffff\1\11\1\uffff\1\11\21\uffff\14\11\1\uffff\1"+
            "\12",
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
            return "2718:1: ( ( () ( (lv_value_1_0= ruleINTEGER ) ) ) | ( () ( (lv_value_3_0= ruleDECIMAL ) ) ) | ( () ( (lv_value_5_0= RULE_STRING ) ) ) | ( () ( (lv_value_7_0= RULE_ENUM_ELEMENT ) ) ) | ( () ( (lv_value_9_0= RULE_BOOLEAN ) ) ) | ( () ( (lv_value_11_0= RULE_BIT ) ) ) | ( () ( (lv_value_13_0= RULE_HEX ) ) ) | ( () ( (otherlv_15= RULE_IDENT ) ) ) )";
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
    public static final BitSet FOLLOW_ruleSTRATEGY_in_ruleMODULE_DECL277 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleINTERFACE_in_ruleMODULE_DECL298 = new BitSet(new long[]{0x0000000000080000L});
    public static final BitSet FOLLOW_ruleBODY_in_ruleMODULE_DECL319 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleMODULE_DECL331 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSTRATEGY_in_entryRuleSTRATEGY367 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSTRATEGY377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleSTRATEGY414 = new BitSet(new long[]{0x0000000000100000L});
    public static final BitSet FOLLOW_20_in_ruleSTRATEGY426 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleSTRATEGY447 = new BitSet(new long[]{0x0000000000800000L});
    public static final BitSet FOLLOW_ruleCRITERION_DECL_in_ruleSTRATEGY468 = new BitSet(new long[]{0x0000000002000000L});
    public static final BitSet FOLLOW_ruleDATASEL_DECL_in_ruleSTRATEGY489 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleSTRATEGY501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTERFACE_in_entryRuleINTERFACE537 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleINTERFACE547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleINTERFACE584 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_21_in_ruleINTERFACE596 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleINTERFACE617 = new BitSet(new long[]{0x0000007C00000000L});
    public static final BitSet FOLLOW_ruleVAR_CST_in_ruleINTERFACE638 = new BitSet(new long[]{0x0000007C00040000L});
    public static final BitSet FOLLOW_18_in_ruleINTERFACE651 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleBODY_in_entryRuleBODY687 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleBODY697 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleBODY734 = new BitSet(new long[]{0x0000000000400000L});
    public static final BitSet FOLLOW_22_in_ruleBODY746 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleBODY767 = new BitSet(new long[]{0x07200100000007F0L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleINSTRUCTION_in_ruleBODY788 = new BitSet(new long[]{0x07200100000407F0L,0x0000000000000090L});
    public static final BitSet FOLLOW_18_in_ruleBODY801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCRITERION_DECL_in_entryRuleCRITERION_DECL837 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCRITERION_DECL847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_ruleCRITERION_DECL884 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleCRITERION_DECL896 = new BitSet(new long[]{0x0000000070000000L});
    public static final BitSet FOLLOW_ruleCRITERION_in_ruleCRITERION_DECL926 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleEND_in_ruleCRITERION_DECL947 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDATASEL_DECL_in_entryRuleDATASEL_DECL983 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDATASEL_DECL993 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleDATASEL_DECL1030 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleDATASEL_DECL1042 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_ruleDATASEL_in_ruleDATASEL_DECL1072 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleDATASEL_DECL1085 = new BitSet(new long[]{0x0000000380000000L});
    public static final BitSet FOLLOW_ruleDATASEL_in_ruleDATASEL_DECL1106 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleEND_in_ruleDATASEL_DECL1129 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEND_in_entryRuleEND1165 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEND1175 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleEND1217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCRITERION_in_entryRuleCRITERION1265 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCRITERION1275 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleCRITERION1319 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleCRITERION1348 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleCRITERION1377 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDATASEL_in_entryRuleDATASEL1428 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDATASEL1438 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleDATASEL1482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_32_in_ruleDATASEL1511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_33_in_ruleDATASEL1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_CST_in_entryRuleVAR_CST1591 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVAR_CST1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_in_ruleVAR_CST1648 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCST_in_ruleVAR_CST1675 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleVAR_in_entryRuleVAR1710 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVAR1720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_ruleVAR1775 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleVAR1792 = new BitSet(new long[]{0x0000000001000000L});
    public static final BitSet FOLLOW_24_in_ruleVAR1809 = new BitSet(new long[]{0x0001FC0000000000L});
    public static final BitSet FOLLOW_ruleTYPE_in_ruleVAR1830 = new BitSet(new long[]{0x0006000008020000L});
    public static final BitSet FOLLOW_ruleRANGE_in_ruleVAR1851 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleEND_in_ruleVAR1873 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleFlow_in_entryRuleFlow1909 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleFlow1919 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_34_in_ruleFlow1963 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_ruleFlow1992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_36_in_ruleFlow2021 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_ruleFlow2050 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCST_in_entryRuleCST2101 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCST2111 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_38_in_ruleCST2163 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleCST2193 = new BitSet(new long[]{0x0000008000000000L});
    public static final BitSet FOLLOW_39_in_ruleCST2210 = new BitSet(new long[]{0x0001FC0000000000L});
    public static final BitSet FOLLOW_ruleTYPE_in_ruleCST2231 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleCST2243 = new BitSet(new long[]{0x00100000000007F0L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleCST2264 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleCST2276 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleEND_in_ruleCST2297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleTYPE_in_entryRuleTYPE2333 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleTYPE2343 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_ruleTYPE2387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_ruleTYPE2416 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_ruleTYPE2445 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_ruleTYPE2474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_ruleTYPE2503 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_ruleTYPE2532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_48_in_ruleTYPE2561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleRANGE_in_entryRuleRANGE2612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleRANGE2622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTERVAL_in_ruleRANGE2669 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLSET_in_ruleRANGE2696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTERVAL_in_entryRuleINTERVAL2731 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleINTERVAL2741 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_49_in_ruleINTERVAL2786 = new BitSet(new long[]{0x00100000000007F0L,0x0000000000000010L});
    public static final BitSet FOLLOW_50_in_ruleINTERVAL2815 = new BitSet(new long[]{0x00100000000007F0L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleINTERVAL2852 = new BitSet(new long[]{0x0008000000000000L});
    public static final BitSet FOLLOW_51_in_ruleINTERVAL2864 = new BitSet(new long[]{0x00100000000007F0L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleINTERVAL2885 = new BitSet(new long[]{0x0006000000000000L});
    public static final BitSet FOLLOW_49_in_ruleINTERVAL2905 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_50_in_ruleINTERVAL2934 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLSET_in_entryRuleLSET2986 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLSET2996 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleLSET3033 = new BitSet(new long[]{0x00100000000007F0L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleLSET3054 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_26_in_ruleLSET3067 = new BitSet(new long[]{0x00100000000007F0L,0x0000000000000010L});
    public static final BitSet FOLLOW_ruleLiteral_in_ruleLSET3088 = new BitSet(new long[]{0x0000000004040000L});
    public static final BitSet FOLLOW_18_in_ruleLSET3102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLiteral_in_entryRuleLiteral3138 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLiteral3148 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTEGER_in_ruleLiteral3204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_ruleLiteral3242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleLiteral3276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleLiteral3315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENUM_ELEMENT_in_ruleLiteral3354 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BIT_in_ruleLiteral3393 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleLiteral3432 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleLiteral3471 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_ruleLiteral3511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINSTRUCTION_in_entryRuleINSTRUCTION3561 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleINSTRUCTION3571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIF_INSTR_in_ruleINSTRUCTION3618 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOOP_INSTR_in_ruleINSTRUCTION3645 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleASSIGN_INSTR_in_ruleINSTRUCTION3672 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleERROR_INSTR_in_ruleINSTRUCTION3699 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNULL_INSTR_in_ruleINSTRUCTION3726 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleIF_INSTR_in_entryRuleIF_INSTR3761 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleIF_INSTR3771 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ruleIF_INSTR3808 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleIF_INSTR3820 = new BitSet(new long[]{0x00000100000007F0L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleIF_INSTR3841 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleIF_INSTR3853 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ruleIF_INSTR3865 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIF_INSTR3877 = new BitSet(new long[]{0x07200100000007F0L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleINSTRUCTION_in_ruleIF_INSTR3898 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIF_INSTR3910 = new BitSet(new long[]{0x0080000000000000L});
    public static final BitSet FOLLOW_55_in_ruleIF_INSTR3931 = new BitSet(new long[]{0x0040000000020000L});
    public static final BitSet FOLLOW_54_in_ruleIF_INSTR3945 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_17_in_ruleIF_INSTR3959 = new BitSet(new long[]{0x07200100000007F0L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleINSTRUCTION_in_ruleIF_INSTR3980 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleIF_INSTR3992 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleLOOP_INSTR_in_entryRuleLOOP_INSTR4029 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleLOOP_INSTR4039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_56_in_ruleLOOP_INSTR4076 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_ruleLOOP_INSTR4088 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleLOOP_INSTR4105 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_ruleLOOP_INSTR4122 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleERROR_INSTR_in_entryRuleERROR_INSTR4158 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleERROR_INSTR4168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_ruleERROR_INSTR4205 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleEND_in_ruleERROR_INSTR4226 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleNULL_INSTR_in_entryRuleNULL_INSTR4262 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleNULL_INSTR4272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_58_in_ruleNULL_INSTR4309 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_ruleEND_in_ruleNULL_INSTR4330 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleASSIGN_INSTR_in_entryRuleASSIGN_INSTR4366 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleASSIGN_INSTR4376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSINGLE_ASSIGN_in_ruleASSIGN_INSTR4422 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_26_in_ruleASSIGN_INSTR4435 = new BitSet(new long[]{0x00000100000007F0L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleSINGLE_ASSIGN_in_ruleASSIGN_INSTR4456 = new BitSet(new long[]{0x000000000C000000L});
    public static final BitSet FOLLOW_ruleEND_in_ruleASSIGN_INSTR4479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSINGLE_ASSIGN_in_entryRuleSINGLE_ASSIGN4515 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSINGLE_ASSIGN4525 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleSINGLE_ASSIGN4571 = new BitSet(new long[]{0x0800000000000000L});
    public static final BitSet FOLLOW_59_in_ruleSINGLE_ASSIGN4583 = new BitSet(new long[]{0x00000100000007F0L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_ruleSINGLE_ASSIGN4604 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_entryRuleEXPRESSION4640 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEXPRESSION4650 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOR_in_ruleEXPRESSION4696 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOR_in_entryRuleOR4730 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOR4740 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAND_in_ruleOR4787 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_60_in_ruleOR4808 = new BitSet(new long[]{0x00000100000007F0L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleAND_in_ruleOR4829 = new BitSet(new long[]{0x1000000000000002L});
    public static final BitSet FOLLOW_ruleAND_in_entryRuleAND4867 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAND4877 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleEQUAL_DIFF_in_ruleAND4924 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_61_in_ruleAND4945 = new BitSet(new long[]{0x00000100000007F0L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleEQUAL_DIFF_in_ruleAND4966 = new BitSet(new long[]{0x2000000000000002L});
    public static final BitSet FOLLOW_ruleEQUAL_DIFF_in_entryRuleEQUAL_DIFF5004 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleEQUAL_DIFF5014 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleCOMPARISON_in_ruleEQUAL_DIFF5061 = new BitSet(new long[]{0x4000008000000002L});
    public static final BitSet FOLLOW_39_in_ruleEQUAL_DIFF5090 = new BitSet(new long[]{0x00000100000007F0L,0x0000000000000090L});
    public static final BitSet FOLLOW_62_in_ruleEQUAL_DIFF5119 = new BitSet(new long[]{0x00000100000007F0L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleCOMPARISON_in_ruleEQUAL_DIFF5156 = new BitSet(new long[]{0x4000008000000002L});
    public static final BitSet FOLLOW_ruleCOMPARISON_in_entryRuleCOMPARISON5194 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleCOMPARISON5204 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleADD_SUB_in_ruleCOMPARISON5251 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000007L});
    public static final BitSet FOLLOW_63_in_ruleCOMPARISON5280 = new BitSet(new long[]{0x00000100000007F0L,0x0000000000000090L});
    public static final BitSet FOLLOW_64_in_ruleCOMPARISON5309 = new BitSet(new long[]{0x00000100000007F0L,0x0000000000000090L});
    public static final BitSet FOLLOW_65_in_ruleCOMPARISON5338 = new BitSet(new long[]{0x00000100000007F0L,0x0000000000000090L});
    public static final BitSet FOLLOW_66_in_ruleCOMPARISON5367 = new BitSet(new long[]{0x00000100000007F0L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleADD_SUB_in_ruleCOMPARISON5404 = new BitSet(new long[]{0x8000000000000002L,0x0000000000000007L});
    public static final BitSet FOLLOW_ruleADD_SUB_in_entryRuleADD_SUB5442 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleADD_SUB5452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMULT_DIV_in_ruleADD_SUB5499 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_67_in_ruleADD_SUB5522 = new BitSet(new long[]{0x00000100000007F0L,0x0000000000000090L});
    public static final BitSet FOLLOW_68_in_ruleADD_SUB5551 = new BitSet(new long[]{0x00000100000007F0L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleMULT_DIV_in_ruleADD_SUB5574 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000018L});
    public static final BitSet FOLLOW_ruleMULT_DIV_in_entryRuleMULT_DIV5612 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMULT_DIV5622 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMULT_DIV5669 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_69_in_ruleMULT_DIV5692 = new BitSet(new long[]{0x00000100000007F0L,0x0000000000000090L});
    public static final BitSet FOLLOW_70_in_ruleMULT_DIV5721 = new BitSet(new long[]{0x00000100000007F0L,0x0000000000000090L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleMULT_DIV5744 = new BitSet(new long[]{0x0000000000000002L,0x0000000000000060L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression5782 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression5792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_rulePrimaryExpression5830 = new BitSet(new long[]{0x00000100000007F0L,0x0000000000000090L});
    public static final BitSet FOLLOW_ruleEXPRESSION_in_rulePrimaryExpression5852 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_rulePrimaryExpression5863 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_71_in_rulePrimaryExpression5892 = new BitSet(new long[]{0x00000100000007F0L,0x0000000000000090L});
    public static final BitSet FOLLOW_rulePrimaryExpression_in_rulePrimaryExpression5913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_rulePrimaryExpression5942 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAtomic_in_entryRuleAtomic5977 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAtomic5987 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTEGER_in_ruleAtomic6043 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_ruleAtomic6081 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleAtomic6115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ENUM_ELEMENT_in_ruleAtomic6154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BOOLEAN_in_ruleAtomic6193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_BIT_in_ruleAtomic6232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_HEX_in_ruleAtomic6271 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_IDENT_in_ruleAtomic6313 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleDECIMAL_in_entryRuleDECIMAL6351 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleDECIMAL6362 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleDECIMAL6401 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDECIMAL6418 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000100L});
    public static final BitSet FOLLOW_72_in_ruleDECIMAL6437 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleDECIMAL6452 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleINTEGER_in_entryRuleINTEGER6499 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleINTEGER6510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_ruleINTEGER6549 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleINTEGER6566 = new BitSet(new long[]{0x0000000000000002L});

}