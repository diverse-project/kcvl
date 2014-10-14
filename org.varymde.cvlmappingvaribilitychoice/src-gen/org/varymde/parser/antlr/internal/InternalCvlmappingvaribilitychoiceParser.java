package org.varymde.parser.antlr.internal; 

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
import org.varymde.services.CvlmappingvaribilitychoiceGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalCvlmappingvaribilitychoiceParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_STRING", "RULE_ID", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'{'", "'}'", "':'", "';'", "'('", "')'", "'HasChoice'", "'where'", "'or'", "'and'", "'xor'", "'!'", "'>'", "'>='", "'<'", "'<='", "'='"
    };
    public static final int RULE_ID=5;
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


        public InternalCvlmappingvaribilitychoiceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalCvlmappingvaribilitychoiceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalCvlmappingvaribilitychoiceParser.tokenNames; }
    public String getGrammarFileName() { return "../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g"; }



     	private CvlmappingvaribilitychoiceGrammarAccess grammarAccess;
     	
        public InternalCvlmappingvaribilitychoiceParser(TokenStream input, CvlmappingvaribilitychoiceGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "RestrictionRuleset";	
       	}
       	
       	@Override
       	protected CvlmappingvaribilitychoiceGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleRestrictionRuleset"
    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:68:1: entryRuleRestrictionRuleset returns [EObject current=null] : iv_ruleRestrictionRuleset= ruleRestrictionRuleset EOF ;
    public final EObject entryRuleRestrictionRuleset() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictionRuleset = null;


        try {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:69:2: (iv_ruleRestrictionRuleset= ruleRestrictionRuleset EOF )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:70:2: iv_ruleRestrictionRuleset= ruleRestrictionRuleset EOF
            {
             newCompositeNode(grammarAccess.getRestrictionRulesetRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRestrictionRuleset_in_entryRuleRestrictionRuleset75);
            iv_ruleRestrictionRuleset=ruleRestrictionRuleset();

            state._fsp--;

             current =iv_ruleRestrictionRuleset; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRestrictionRuleset85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRestrictionRuleset"


    // $ANTLR start "ruleRestrictionRuleset"
    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:77:1: ruleRestrictionRuleset returns [EObject current=null] : ( ( (lv_cvlmodel_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_rule_2_0= ruleRestrictionRule ) ) ( (lv_rule_3_0= ruleRestrictionRule ) )* ) otherlv_4= '}' ) ;
    public final EObject ruleRestrictionRuleset() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_cvlmodel_0_0 = null;

        EObject lv_rule_2_0 = null;

        EObject lv_rule_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:80:28: ( ( ( (lv_cvlmodel_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_rule_2_0= ruleRestrictionRule ) ) ( (lv_rule_3_0= ruleRestrictionRule ) )* ) otherlv_4= '}' ) )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:81:1: ( ( (lv_cvlmodel_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_rule_2_0= ruleRestrictionRule ) ) ( (lv_rule_3_0= ruleRestrictionRule ) )* ) otherlv_4= '}' )
            {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:81:1: ( ( (lv_cvlmodel_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_rule_2_0= ruleRestrictionRule ) ) ( (lv_rule_3_0= ruleRestrictionRule ) )* ) otherlv_4= '}' )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:81:2: ( (lv_cvlmodel_0_0= ruleEString ) ) otherlv_1= '{' ( ( (lv_rule_2_0= ruleRestrictionRule ) ) ( (lv_rule_3_0= ruleRestrictionRule ) )* ) otherlv_4= '}'
            {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:81:2: ( (lv_cvlmodel_0_0= ruleEString ) )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:82:1: (lv_cvlmodel_0_0= ruleEString )
            {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:82:1: (lv_cvlmodel_0_0= ruleEString )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:83:3: lv_cvlmodel_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRestrictionRulesetAccess().getCvlmodelEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRestrictionRuleset131);
            lv_cvlmodel_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRestrictionRulesetRule());
            	        }
                   		set(
                   			current, 
                   			"cvlmodel",
                    		lv_cvlmodel_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_ruleRestrictionRuleset143); 

                	newLeafNode(otherlv_1, grammarAccess.getRestrictionRulesetAccess().getLeftCurlyBracketKeyword_1());
                
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:103:1: ( ( (lv_rule_2_0= ruleRestrictionRule ) ) ( (lv_rule_3_0= ruleRestrictionRule ) )* )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:103:2: ( (lv_rule_2_0= ruleRestrictionRule ) ) ( (lv_rule_3_0= ruleRestrictionRule ) )*
            {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:103:2: ( (lv_rule_2_0= ruleRestrictionRule ) )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:104:1: (lv_rule_2_0= ruleRestrictionRule )
            {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:104:1: (lv_rule_2_0= ruleRestrictionRule )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:105:3: lv_rule_2_0= ruleRestrictionRule
            {
             
            	        newCompositeNode(grammarAccess.getRestrictionRulesetAccess().getRuleRestrictionRuleParserRuleCall_2_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleRestrictionRule_in_ruleRestrictionRuleset165);
            lv_rule_2_0=ruleRestrictionRule();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRestrictionRulesetRule());
            	        }
                   		add(
                   			current, 
                   			"rule",
                    		lv_rule_2_0, 
                    		"RestrictionRule");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:121:2: ( (lv_rule_3_0= ruleRestrictionRule ) )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=RULE_STRING && LA1_0<=RULE_ID)) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:122:1: (lv_rule_3_0= ruleRestrictionRule )
            	    {
            	    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:122:1: (lv_rule_3_0= ruleRestrictionRule )
            	    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:123:3: lv_rule_3_0= ruleRestrictionRule
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRestrictionRulesetAccess().getRuleRestrictionRuleParserRuleCall_2_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleRestrictionRule_in_ruleRestrictionRuleset186);
            	    lv_rule_3_0=ruleRestrictionRule();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRestrictionRulesetRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"rule",
            	            		lv_rule_3_0, 
            	            		"RestrictionRule");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            otherlv_4=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleRestrictionRuleset200); 

                	newLeafNode(otherlv_4, grammarAccess.getRestrictionRulesetAccess().getRightCurlyBracketKeyword_3());
                

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
    // $ANTLR end "ruleRestrictionRuleset"


    // $ANTLR start "entryRuleRestrictionRule"
    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:151:1: entryRuleRestrictionRule returns [EObject current=null] : iv_ruleRestrictionRule= ruleRestrictionRule EOF ;
    public final EObject entryRuleRestrictionRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRestrictionRule = null;


        try {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:152:2: (iv_ruleRestrictionRule= ruleRestrictionRule EOF )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:153:2: iv_ruleRestrictionRule= ruleRestrictionRule EOF
            {
             newCompositeNode(grammarAccess.getRestrictionRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRestrictionRule_in_entryRuleRestrictionRule236);
            iv_ruleRestrictionRule=ruleRestrictionRule();

            state._fsp--;

             current =iv_ruleRestrictionRule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRestrictionRule246); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRestrictionRule"


    // $ANTLR start "ruleRestrictionRule"
    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:160:1: ruleRestrictionRule returns [EObject current=null] : ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleBinExpression ) ) otherlv_3= ';' ) ;
    public final EObject ruleRestrictionRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_name_0_0 = null;

        EObject lv_expression_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:163:28: ( ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleBinExpression ) ) otherlv_3= ';' ) )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:164:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleBinExpression ) ) otherlv_3= ';' )
            {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:164:1: ( ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleBinExpression ) ) otherlv_3= ';' )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:164:2: ( (lv_name_0_0= ruleEString ) ) otherlv_1= ':' ( (lv_expression_2_0= ruleBinExpression ) ) otherlv_3= ';'
            {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:164:2: ( (lv_name_0_0= ruleEString ) )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:165:1: (lv_name_0_0= ruleEString )
            {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:165:1: (lv_name_0_0= ruleEString )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:166:3: lv_name_0_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getRestrictionRuleAccess().getNameEStringParserRuleCall_0_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleRestrictionRule292);
            lv_name_0_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRestrictionRuleRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_0_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_1=(Token)match(input,13,FollowSets000.FOLLOW_13_in_ruleRestrictionRule304); 

                	newLeafNode(otherlv_1, grammarAccess.getRestrictionRuleAccess().getColonKeyword_1());
                
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:186:1: ( (lv_expression_2_0= ruleBinExpression ) )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:187:1: (lv_expression_2_0= ruleBinExpression )
            {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:187:1: (lv_expression_2_0= ruleBinExpression )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:188:3: lv_expression_2_0= ruleBinExpression
            {
             
            	        newCompositeNode(grammarAccess.getRestrictionRuleAccess().getExpressionBinExpressionParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleBinExpression_in_ruleRestrictionRule325);
            lv_expression_2_0=ruleBinExpression();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getRestrictionRuleRule());
            	        }
                   		set(
                   			current, 
                   			"expression",
                    		lv_expression_2_0, 
                    		"BinExpression");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,14,FollowSets000.FOLLOW_14_in_ruleRestrictionRule337); 

                	newLeafNode(otherlv_3, grammarAccess.getRestrictionRuleAccess().getSemicolonKeyword_3());
                

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
    // $ANTLR end "ruleRestrictionRule"


    // $ANTLR start "entryRuleBinExpression"
    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:216:1: entryRuleBinExpression returns [EObject current=null] : iv_ruleBinExpression= ruleBinExpression EOF ;
    public final EObject entryRuleBinExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleBinExpression = null;


        try {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:217:2: (iv_ruleBinExpression= ruleBinExpression EOF )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:218:2: iv_ruleBinExpression= ruleBinExpression EOF
            {
             newCompositeNode(grammarAccess.getBinExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleBinExpression_in_entryRuleBinExpression373);
            iv_ruleBinExpression=ruleBinExpression();

            state._fsp--;

             current =iv_ruleBinExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleBinExpression383); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleBinExpression"


    // $ANTLR start "ruleBinExpression"
    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:225:1: ruleBinExpression returns [EObject current=null] : (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) ;
    public final EObject ruleBinExpression() throws RecognitionException {
        EObject current = null;

        EObject this_PrimaryExpression_0 = null;

        Enumerator lv_op_2_0 = null;

        EObject lv_right_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:228:28: ( (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* ) )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:229:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:229:1: (this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )* )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:230:5: this_PrimaryExpression_0= rulePrimaryExpression ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            {
             
                    newCompositeNode(grammarAccess.getBinExpressionAccess().getPrimaryExpressionParserRuleCall_0()); 
                
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_ruleBinExpression430);
            this_PrimaryExpression_0=rulePrimaryExpression();

            state._fsp--;

             
                    current = this_PrimaryExpression_0; 
                    afterParserOrEnumRuleCall();
                
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:238:1: ( () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= rulePrimaryExpression ) ) )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>=19 && LA2_0<=21)) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:238:2: () ( (lv_op_2_0= ruleOperator ) ) ( (lv_right_3_0= rulePrimaryExpression ) )
            	    {
            	    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:238:2: ()
            	    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:239:5: 
            	    {

            	            current = forceCreateModelElementAndSet(
            	                grammarAccess.getBinExpressionAccess().getBinExpressionLeftAction_1_0(),
            	                current);
            	        

            	    }

            	    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:244:2: ( (lv_op_2_0= ruleOperator ) )
            	    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:245:1: (lv_op_2_0= ruleOperator )
            	    {
            	    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:245:1: (lv_op_2_0= ruleOperator )
            	    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:246:3: lv_op_2_0= ruleOperator
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBinExpressionAccess().getOpOperatorEnumRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_ruleOperator_in_ruleBinExpression460);
            	    lv_op_2_0=ruleOperator();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBinExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"op",
            	            		lv_op_2_0, 
            	            		"Operator");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }

            	    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:262:2: ( (lv_right_3_0= rulePrimaryExpression ) )
            	    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:263:1: (lv_right_3_0= rulePrimaryExpression )
            	    {
            	    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:263:1: (lv_right_3_0= rulePrimaryExpression )
            	    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:264:3: lv_right_3_0= rulePrimaryExpression
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getBinExpressionAccess().getRightPrimaryExpressionParserRuleCall_1_2_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_ruleBinExpression481);
            	    lv_right_3_0=rulePrimaryExpression();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getBinExpressionRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"right",
            	            		lv_right_3_0, 
            	            		"PrimaryExpression");
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
    // $ANTLR end "ruleBinExpression"


    // $ANTLR start "entryRulePrimaryExpression"
    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:288:1: entryRulePrimaryExpression returns [EObject current=null] : iv_rulePrimaryExpression= rulePrimaryExpression EOF ;
    public final EObject entryRulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePrimaryExpression = null;


        try {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:289:2: (iv_rulePrimaryExpression= rulePrimaryExpression EOF )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:290:2: iv_rulePrimaryExpression= rulePrimaryExpression EOF
            {
             newCompositeNode(grammarAccess.getPrimaryExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression519);
            iv_rulePrimaryExpression=rulePrimaryExpression();

            state._fsp--;

             current =iv_rulePrimaryExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePrimaryExpression529); 

            }

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
    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:297:1: rulePrimaryExpression returns [EObject current=null] : ( ( () ( (lv_op_1_0= ruleUnaryOperator ) ) ( (lv_left_2_0= ruleHasChoice ) ) ) | ( ( () ( (lv_op_4_0= ruleUnaryOperator ) ) otherlv_5= '(' ( (lv_left_6_0= ruleBinExpression ) ) ) otherlv_7= ')' ) | ( ( () otherlv_9= '(' ( (lv_left_10_0= ruleBinExpression ) ) ) otherlv_11= ')' ) | this_HasChoice_12= ruleHasChoice ) ;
    public final EObject rulePrimaryExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_5=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_11=null;
        Enumerator lv_op_1_0 = null;

        EObject lv_left_2_0 = null;

        Enumerator lv_op_4_0 = null;

        EObject lv_left_6_0 = null;

        EObject lv_left_10_0 = null;

        EObject this_HasChoice_12 = null;


         enterRule(); 
            
        try {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:300:28: ( ( ( () ( (lv_op_1_0= ruleUnaryOperator ) ) ( (lv_left_2_0= ruleHasChoice ) ) ) | ( ( () ( (lv_op_4_0= ruleUnaryOperator ) ) otherlv_5= '(' ( (lv_left_6_0= ruleBinExpression ) ) ) otherlv_7= ')' ) | ( ( () otherlv_9= '(' ( (lv_left_10_0= ruleBinExpression ) ) ) otherlv_11= ')' ) | this_HasChoice_12= ruleHasChoice ) )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:301:1: ( ( () ( (lv_op_1_0= ruleUnaryOperator ) ) ( (lv_left_2_0= ruleHasChoice ) ) ) | ( ( () ( (lv_op_4_0= ruleUnaryOperator ) ) otherlv_5= '(' ( (lv_left_6_0= ruleBinExpression ) ) ) otherlv_7= ')' ) | ( ( () otherlv_9= '(' ( (lv_left_10_0= ruleBinExpression ) ) ) otherlv_11= ')' ) | this_HasChoice_12= ruleHasChoice )
            {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:301:1: ( ( () ( (lv_op_1_0= ruleUnaryOperator ) ) ( (lv_left_2_0= ruleHasChoice ) ) ) | ( ( () ( (lv_op_4_0= ruleUnaryOperator ) ) otherlv_5= '(' ( (lv_left_6_0= ruleBinExpression ) ) ) otherlv_7= ')' ) | ( ( () otherlv_9= '(' ( (lv_left_10_0= ruleBinExpression ) ) ) otherlv_11= ')' ) | this_HasChoice_12= ruleHasChoice )
            int alt3=4;
            switch ( input.LA(1) ) {
            case 22:
                {
                int LA3_1 = input.LA(2);

                if ( (LA3_1==15) ) {
                    alt3=2;
                }
                else if ( (LA3_1==17) ) {
                    alt3=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 3, 1, input);

                    throw nvae;
                }
                }
                break;
            case 15:
                {
                alt3=3;
                }
                break;
            case 17:
                {
                alt3=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:301:2: ( () ( (lv_op_1_0= ruleUnaryOperator ) ) ( (lv_left_2_0= ruleHasChoice ) ) )
                    {
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:301:2: ( () ( (lv_op_1_0= ruleUnaryOperator ) ) ( (lv_left_2_0= ruleHasChoice ) ) )
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:301:3: () ( (lv_op_1_0= ruleUnaryOperator ) ) ( (lv_left_2_0= ruleHasChoice ) )
                    {
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:301:3: ()
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:302:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getUnaryExpressionAction_0_0(),
                                current);
                        

                    }

                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:307:2: ( (lv_op_1_0= ruleUnaryOperator ) )
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:308:1: (lv_op_1_0= ruleUnaryOperator )
                    {
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:308:1: (lv_op_1_0= ruleUnaryOperator )
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:309:3: lv_op_1_0= ruleUnaryOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOpUnaryOperatorEnumRuleCall_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperator_in_rulePrimaryExpression585);
                    lv_op_1_0=ruleUnaryOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"op",
                            		lv_op_1_0, 
                            		"UnaryOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:325:2: ( (lv_left_2_0= ruleHasChoice ) )
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:326:1: (lv_left_2_0= ruleHasChoice )
                    {
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:326:1: (lv_left_2_0= ruleHasChoice )
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:327:3: lv_left_2_0= ruleHasChoice
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLeftHasChoiceParserRuleCall_0_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleHasChoice_in_rulePrimaryExpression606);
                    lv_left_2_0=ruleHasChoice();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"left",
                            		lv_left_2_0, 
                            		"HasChoice");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:344:6: ( ( () ( (lv_op_4_0= ruleUnaryOperator ) ) otherlv_5= '(' ( (lv_left_6_0= ruleBinExpression ) ) ) otherlv_7= ')' )
                    {
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:344:6: ( ( () ( (lv_op_4_0= ruleUnaryOperator ) ) otherlv_5= '(' ( (lv_left_6_0= ruleBinExpression ) ) ) otherlv_7= ')' )
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:344:7: ( () ( (lv_op_4_0= ruleUnaryOperator ) ) otherlv_5= '(' ( (lv_left_6_0= ruleBinExpression ) ) ) otherlv_7= ')'
                    {
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:344:7: ( () ( (lv_op_4_0= ruleUnaryOperator ) ) otherlv_5= '(' ( (lv_left_6_0= ruleBinExpression ) ) )
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:344:8: () ( (lv_op_4_0= ruleUnaryOperator ) ) otherlv_5= '(' ( (lv_left_6_0= ruleBinExpression ) )
                    {
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:344:8: ()
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:345:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getUnaryExpressionAction_1_0_0(),
                                current);
                        

                    }

                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:350:2: ( (lv_op_4_0= ruleUnaryOperator ) )
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:351:1: (lv_op_4_0= ruleUnaryOperator )
                    {
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:351:1: (lv_op_4_0= ruleUnaryOperator )
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:352:3: lv_op_4_0= ruleUnaryOperator
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getOpUnaryOperatorEnumRuleCall_1_0_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleUnaryOperator_in_rulePrimaryExpression645);
                    lv_op_4_0=ruleUnaryOperator();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"op",
                            		lv_op_4_0, 
                            		"UnaryOperator");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_5=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePrimaryExpression657); 

                        	newLeafNode(otherlv_5, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_1_0_2());
                        
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:372:1: ( (lv_left_6_0= ruleBinExpression ) )
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:373:1: (lv_left_6_0= ruleBinExpression )
                    {
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:373:1: (lv_left_6_0= ruleBinExpression )
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:374:3: lv_left_6_0= ruleBinExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLeftBinExpressionParserRuleCall_1_0_3_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBinExpression_in_rulePrimaryExpression678);
                    lv_left_6_0=ruleBinExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"left",
                            		lv_left_6_0, 
                            		"BinExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }

                    otherlv_7=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePrimaryExpression691); 

                        	newLeafNode(otherlv_7, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_1_1());
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:395:6: ( ( () otherlv_9= '(' ( (lv_left_10_0= ruleBinExpression ) ) ) otherlv_11= ')' )
                    {
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:395:6: ( ( () otherlv_9= '(' ( (lv_left_10_0= ruleBinExpression ) ) ) otherlv_11= ')' )
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:395:7: ( () otherlv_9= '(' ( (lv_left_10_0= ruleBinExpression ) ) ) otherlv_11= ')'
                    {
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:395:7: ( () otherlv_9= '(' ( (lv_left_10_0= ruleBinExpression ) ) )
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:395:8: () otherlv_9= '(' ( (lv_left_10_0= ruleBinExpression ) )
                    {
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:395:8: ()
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:396:5: 
                    {

                            current = forceCreateModelElement(
                                grammarAccess.getPrimaryExpressionAccess().getUnaryExpressionAction_2_0_0(),
                                current);
                        

                    }

                    otherlv_9=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePrimaryExpression721); 

                        	newLeafNode(otherlv_9, grammarAccess.getPrimaryExpressionAccess().getLeftParenthesisKeyword_2_0_1());
                        
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:405:1: ( (lv_left_10_0= ruleBinExpression ) )
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:406:1: (lv_left_10_0= ruleBinExpression )
                    {
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:406:1: (lv_left_10_0= ruleBinExpression )
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:407:3: lv_left_10_0= ruleBinExpression
                    {
                     
                    	        newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getLeftBinExpressionParserRuleCall_2_0_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleBinExpression_in_rulePrimaryExpression742);
                    lv_left_10_0=ruleBinExpression();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPrimaryExpressionRule());
                    	        }
                           		set(
                           			current, 
                           			"left",
                            		lv_left_10_0, 
                            		"BinExpression");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }

                    otherlv_11=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePrimaryExpression755); 

                        	newLeafNode(otherlv_11, grammarAccess.getPrimaryExpressionAccess().getRightParenthesisKeyword_2_1());
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:429:5: this_HasChoice_12= ruleHasChoice
                    {
                     
                            newCompositeNode(grammarAccess.getPrimaryExpressionAccess().getHasChoiceParserRuleCall_3()); 
                        
                    pushFollow(FollowSets000.FOLLOW_ruleHasChoice_in_rulePrimaryExpression784);
                    this_HasChoice_12=ruleHasChoice();

                    state._fsp--;

                     
                            current = this_HasChoice_12; 
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
    // $ANTLR end "rulePrimaryExpression"


    // $ANTLR start "entryRuleHasChoice"
    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:445:1: entryRuleHasChoice returns [EObject current=null] : iv_ruleHasChoice= ruleHasChoice EOF ;
    public final EObject entryRuleHasChoice() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleHasChoice = null;


        try {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:446:2: (iv_ruleHasChoice= ruleHasChoice EOF )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:447:2: iv_ruleHasChoice= ruleHasChoice EOF
            {
             newCompositeNode(grammarAccess.getHasChoiceRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleHasChoice_in_entryRuleHasChoice819);
            iv_ruleHasChoice=ruleHasChoice();

            state._fsp--;

             current =iv_ruleHasChoice; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleHasChoice829); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleHasChoice"


    // $ANTLR start "ruleHasChoice"
    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:454:1: ruleHasChoice returns [EObject current=null] : (otherlv_0= 'HasChoice' ( (lv_choiceName_1_0= ruleEString ) ) (otherlv_2= 'where' ( (lv_condition_3_0= ruleCondition ) ) )? ) ;
    public final EObject ruleHasChoice() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        AntlrDatatypeRuleToken lv_choiceName_1_0 = null;

        EObject lv_condition_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:457:28: ( (otherlv_0= 'HasChoice' ( (lv_choiceName_1_0= ruleEString ) ) (otherlv_2= 'where' ( (lv_condition_3_0= ruleCondition ) ) )? ) )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:458:1: (otherlv_0= 'HasChoice' ( (lv_choiceName_1_0= ruleEString ) ) (otherlv_2= 'where' ( (lv_condition_3_0= ruleCondition ) ) )? )
            {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:458:1: (otherlv_0= 'HasChoice' ( (lv_choiceName_1_0= ruleEString ) ) (otherlv_2= 'where' ( (lv_condition_3_0= ruleCondition ) ) )? )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:458:3: otherlv_0= 'HasChoice' ( (lv_choiceName_1_0= ruleEString ) ) (otherlv_2= 'where' ( (lv_condition_3_0= ruleCondition ) ) )?
            {
            otherlv_0=(Token)match(input,17,FollowSets000.FOLLOW_17_in_ruleHasChoice866); 

                	newLeafNode(otherlv_0, grammarAccess.getHasChoiceAccess().getHasChoiceKeyword_0());
                
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:462:1: ( (lv_choiceName_1_0= ruleEString ) )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:463:1: (lv_choiceName_1_0= ruleEString )
            {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:463:1: (lv_choiceName_1_0= ruleEString )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:464:3: lv_choiceName_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getHasChoiceAccess().getChoiceNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleHasChoice887);
            lv_choiceName_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getHasChoiceRule());
            	        }
                   		set(
                   			current, 
                   			"choiceName",
                    		lv_choiceName_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:480:2: (otherlv_2= 'where' ( (lv_condition_3_0= ruleCondition ) ) )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==18) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:480:4: otherlv_2= 'where' ( (lv_condition_3_0= ruleCondition ) )
                    {
                    otherlv_2=(Token)match(input,18,FollowSets000.FOLLOW_18_in_ruleHasChoice900); 

                        	newLeafNode(otherlv_2, grammarAccess.getHasChoiceAccess().getWhereKeyword_2_0());
                        
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:484:1: ( (lv_condition_3_0= ruleCondition ) )
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:485:1: (lv_condition_3_0= ruleCondition )
                    {
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:485:1: (lv_condition_3_0= ruleCondition )
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:486:3: lv_condition_3_0= ruleCondition
                    {
                     
                    	        newCompositeNode(grammarAccess.getHasChoiceAccess().getConditionConditionParserRuleCall_2_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleCondition_in_ruleHasChoice921);
                    lv_condition_3_0=ruleCondition();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getHasChoiceRule());
                    	        }
                           		set(
                           			current, 
                           			"condition",
                            		lv_condition_3_0, 
                            		"Condition");
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
    // $ANTLR end "ruleHasChoice"


    // $ANTLR start "entryRuleCondition"
    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:510:1: entryRuleCondition returns [EObject current=null] : iv_ruleCondition= ruleCondition EOF ;
    public final EObject entryRuleCondition() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCondition = null;


        try {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:511:2: (iv_ruleCondition= ruleCondition EOF )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:512:2: iv_ruleCondition= ruleCondition EOF
            {
             newCompositeNode(grammarAccess.getConditionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCondition_in_entryRuleCondition959);
            iv_ruleCondition=ruleCondition();

            state._fsp--;

             current =iv_ruleCondition; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCondition969); 

            }

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
    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:519:1: ruleCondition returns [EObject current=null] : this_ConditionExpression_0= ruleConditionExpression ;
    public final EObject ruleCondition() throws RecognitionException {
        EObject current = null;

        EObject this_ConditionExpression_0 = null;


         enterRule(); 
            
        try {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:522:28: (this_ConditionExpression_0= ruleConditionExpression )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:524:5: this_ConditionExpression_0= ruleConditionExpression
            {
             
                    newCompositeNode(grammarAccess.getConditionAccess().getConditionExpressionParserRuleCall()); 
                
            pushFollow(FollowSets000.FOLLOW_ruleConditionExpression_in_ruleCondition1015);
            this_ConditionExpression_0=ruleConditionExpression();

            state._fsp--;

             
                    current = this_ConditionExpression_0; 
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
    // $ANTLR end "ruleCondition"


    // $ANTLR start "entryRuleEString"
    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:540:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:541:2: (iv_ruleEString= ruleEString EOF )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:542:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString1050);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString1061); 

            }

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
    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:549:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:552:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:553:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:553:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==RULE_STRING) ) {
                alt5=1;
            }
            else if ( (LA5_0==RULE_ID) ) {
                alt5=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }
            switch (alt5) {
                case 1 :
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:553:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString1101); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:561:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString1127); 

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


    // $ANTLR start "entryRuleValue"
    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:576:1: entryRuleValue returns [String current=null] : iv_ruleValue= ruleValue EOF ;
    public final String entryRuleValue() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleValue = null;


        try {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:577:2: (iv_ruleValue= ruleValue EOF )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:578:2: iv_ruleValue= ruleValue EOF
            {
             newCompositeNode(grammarAccess.getValueRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleValue_in_entryRuleValue1173);
            iv_ruleValue=ruleValue();

            state._fsp--;

             current =iv_ruleValue.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleValue1184); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleValue"


    // $ANTLR start "ruleValue"
    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:585:1: ruleValue returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleValue() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;
        Token this_INT_2=null;

         enterRule(); 
            
        try {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:588:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT ) )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:589:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT )
            {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:589:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID | this_INT_2= RULE_INT )
            int alt6=3;
            switch ( input.LA(1) ) {
            case RULE_STRING:
                {
                alt6=1;
                }
                break;
            case RULE_ID:
                {
                alt6=2;
                }
                break;
            case RULE_INT:
                {
                alt6=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:589:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleValue1224); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getValueAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:597:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleValue1250); 

                    		current.merge(this_ID_1);
                        
                     
                        newLeafNode(this_ID_1, grammarAccess.getValueAccess().getIDTerminalRuleCall_1()); 
                        

                    }
                    break;
                case 3 :
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:605:10: this_INT_2= RULE_INT
                    {
                    this_INT_2=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleValue1276); 

                    		current.merge(this_INT_2);
                        
                     
                        newLeafNode(this_INT_2, grammarAccess.getValueAccess().getINTTerminalRuleCall_2()); 
                        

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
    // $ANTLR end "ruleValue"


    // $ANTLR start "entryRuleConditionExpression"
    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:620:1: entryRuleConditionExpression returns [EObject current=null] : iv_ruleConditionExpression= ruleConditionExpression EOF ;
    public final EObject entryRuleConditionExpression() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleConditionExpression = null;


        try {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:621:2: (iv_ruleConditionExpression= ruleConditionExpression EOF )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:622:2: iv_ruleConditionExpression= ruleConditionExpression EOF
            {
             newCompositeNode(grammarAccess.getConditionExpressionRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleConditionExpression_in_entryRuleConditionExpression1321);
            iv_ruleConditionExpression=ruleConditionExpression();

            state._fsp--;

             current =iv_ruleConditionExpression; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleConditionExpression1331); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleConditionExpression"


    // $ANTLR start "ruleConditionExpression"
    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:629:1: ruleConditionExpression returns [EObject current=null] : (otherlv_0= '(' ( (lv_featureAttibuteName_1_0= ruleEString ) ) ( (lv_op_2_0= ruleCompareOperator ) ) ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' ) ;
    public final EObject ruleConditionExpression() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_4=null;
        AntlrDatatypeRuleToken lv_featureAttibuteName_1_0 = null;

        Enumerator lv_op_2_0 = null;

        AntlrDatatypeRuleToken lv_value_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:632:28: ( (otherlv_0= '(' ( (lv_featureAttibuteName_1_0= ruleEString ) ) ( (lv_op_2_0= ruleCompareOperator ) ) ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' ) )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:633:1: (otherlv_0= '(' ( (lv_featureAttibuteName_1_0= ruleEString ) ) ( (lv_op_2_0= ruleCompareOperator ) ) ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' )
            {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:633:1: (otherlv_0= '(' ( (lv_featureAttibuteName_1_0= ruleEString ) ) ( (lv_op_2_0= ruleCompareOperator ) ) ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')' )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:633:3: otherlv_0= '(' ( (lv_featureAttibuteName_1_0= ruleEString ) ) ( (lv_op_2_0= ruleCompareOperator ) ) ( (lv_value_3_0= ruleValue ) ) otherlv_4= ')'
            {
            otherlv_0=(Token)match(input,15,FollowSets000.FOLLOW_15_in_ruleConditionExpression1368); 

                	newLeafNode(otherlv_0, grammarAccess.getConditionExpressionAccess().getLeftParenthesisKeyword_0());
                
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:637:1: ( (lv_featureAttibuteName_1_0= ruleEString ) )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:638:1: (lv_featureAttibuteName_1_0= ruleEString )
            {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:638:1: (lv_featureAttibuteName_1_0= ruleEString )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:639:3: lv_featureAttibuteName_1_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getConditionExpressionAccess().getFeatureAttibuteNameEStringParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleConditionExpression1389);
            lv_featureAttibuteName_1_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"featureAttibuteName",
                    		lv_featureAttibuteName_1_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:655:2: ( (lv_op_2_0= ruleCompareOperator ) )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:656:1: (lv_op_2_0= ruleCompareOperator )
            {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:656:1: (lv_op_2_0= ruleCompareOperator )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:657:3: lv_op_2_0= ruleCompareOperator
            {
             
            	        newCompositeNode(grammarAccess.getConditionExpressionAccess().getOpCompareOperatorEnumRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleCompareOperator_in_ruleConditionExpression1410);
            lv_op_2_0=ruleCompareOperator();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"op",
                    		lv_op_2_0, 
                    		"CompareOperator");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:673:2: ( (lv_value_3_0= ruleValue ) )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:674:1: (lv_value_3_0= ruleValue )
            {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:674:1: (lv_value_3_0= ruleValue )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:675:3: lv_value_3_0= ruleValue
            {
             
            	        newCompositeNode(grammarAccess.getConditionExpressionAccess().getValueValueParserRuleCall_3_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleValue_in_ruleConditionExpression1431);
            lv_value_3_0=ruleValue();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getConditionExpressionRule());
            	        }
                   		set(
                   			current, 
                   			"value",
                    		lv_value_3_0, 
                    		"Value");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_4=(Token)match(input,16,FollowSets000.FOLLOW_16_in_ruleConditionExpression1443); 

                	newLeafNode(otherlv_4, grammarAccess.getConditionExpressionAccess().getRightParenthesisKeyword_4());
                

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
    // $ANTLR end "ruleConditionExpression"


    // $ANTLR start "ruleOperator"
    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:703:1: ruleOperator returns [Enumerator current=null] : ( (enumLiteral_0= 'or' ) | (enumLiteral_1= 'and' ) | (enumLiteral_2= 'xor' ) ) ;
    public final Enumerator ruleOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;

         enterRule(); 
        try {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:705:28: ( ( (enumLiteral_0= 'or' ) | (enumLiteral_1= 'and' ) | (enumLiteral_2= 'xor' ) ) )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:706:1: ( (enumLiteral_0= 'or' ) | (enumLiteral_1= 'and' ) | (enumLiteral_2= 'xor' ) )
            {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:706:1: ( (enumLiteral_0= 'or' ) | (enumLiteral_1= 'and' ) | (enumLiteral_2= 'xor' ) )
            int alt7=3;
            switch ( input.LA(1) ) {
            case 19:
                {
                alt7=1;
                }
                break;
            case 20:
                {
                alt7=2;
                }
                break;
            case 21:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:706:2: (enumLiteral_0= 'or' )
                    {
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:706:2: (enumLiteral_0= 'or' )
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:706:4: enumLiteral_0= 'or'
                    {
                    enumLiteral_0=(Token)match(input,19,FollowSets000.FOLLOW_19_in_ruleOperator1493); 

                            current = grammarAccess.getOperatorAccess().getOrEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getOperatorAccess().getOrEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:712:6: (enumLiteral_1= 'and' )
                    {
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:712:6: (enumLiteral_1= 'and' )
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:712:8: enumLiteral_1= 'and'
                    {
                    enumLiteral_1=(Token)match(input,20,FollowSets000.FOLLOW_20_in_ruleOperator1510); 

                            current = grammarAccess.getOperatorAccess().getAndEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getOperatorAccess().getAndEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:718:6: (enumLiteral_2= 'xor' )
                    {
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:718:6: (enumLiteral_2= 'xor' )
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:718:8: enumLiteral_2= 'xor'
                    {
                    enumLiteral_2=(Token)match(input,21,FollowSets000.FOLLOW_21_in_ruleOperator1527); 

                            current = grammarAccess.getOperatorAccess().getXorEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getOperatorAccess().getXorEnumLiteralDeclaration_2()); 
                        

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
    // $ANTLR end "ruleOperator"


    // $ANTLR start "ruleUnaryOperator"
    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:728:1: ruleUnaryOperator returns [Enumerator current=null] : (enumLiteral_0= '!' ) ;
    public final Enumerator ruleUnaryOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;

         enterRule(); 
        try {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:730:28: ( (enumLiteral_0= '!' ) )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:731:1: (enumLiteral_0= '!' )
            {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:731:1: (enumLiteral_0= '!' )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:731:3: enumLiteral_0= '!'
            {
            enumLiteral_0=(Token)match(input,22,FollowSets000.FOLLOW_22_in_ruleUnaryOperator1571); 

                    current = grammarAccess.getUnaryOperatorAccess().getNotEnumLiteralDeclaration().getEnumLiteral().getInstance();
                    newLeafNode(enumLiteral_0, grammarAccess.getUnaryOperatorAccess().getNotEnumLiteralDeclaration()); 
                

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
    // $ANTLR end "ruleUnaryOperator"


    // $ANTLR start "ruleCompareOperator"
    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:741:1: ruleCompareOperator returns [Enumerator current=null] : ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '=' ) ) ;
    public final Enumerator ruleCompareOperator() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:743:28: ( ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '=' ) ) )
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:744:1: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '=' ) )
            {
            // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:744:1: ( (enumLiteral_0= '>' ) | (enumLiteral_1= '>=' ) | (enumLiteral_2= '<' ) | (enumLiteral_3= '<=' ) | (enumLiteral_4= '=' ) )
            int alt8=5;
            switch ( input.LA(1) ) {
            case 23:
                {
                alt8=1;
                }
                break;
            case 24:
                {
                alt8=2;
                }
                break;
            case 25:
                {
                alt8=3;
                }
                break;
            case 26:
                {
                alt8=4;
                }
                break;
            case 27:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:744:2: (enumLiteral_0= '>' )
                    {
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:744:2: (enumLiteral_0= '>' )
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:744:4: enumLiteral_0= '>'
                    {
                    enumLiteral_0=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCompareOperator1615); 

                            current = grammarAccess.getCompareOperatorAccess().getSupEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getCompareOperatorAccess().getSupEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:750:6: (enumLiteral_1= '>=' )
                    {
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:750:6: (enumLiteral_1= '>=' )
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:750:8: enumLiteral_1= '>='
                    {
                    enumLiteral_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleCompareOperator1632); 

                            current = grammarAccess.getCompareOperatorAccess().getSupeqEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getCompareOperatorAccess().getSupeqEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:756:6: (enumLiteral_2= '<' )
                    {
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:756:6: (enumLiteral_2= '<' )
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:756:8: enumLiteral_2= '<'
                    {
                    enumLiteral_2=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleCompareOperator1649); 

                            current = grammarAccess.getCompareOperatorAccess().getInfEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getCompareOperatorAccess().getInfEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:762:6: (enumLiteral_3= '<=' )
                    {
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:762:6: (enumLiteral_3= '<=' )
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:762:8: enumLiteral_3= '<='
                    {
                    enumLiteral_3=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCompareOperator1666); 

                            current = grammarAccess.getCompareOperatorAccess().getInfeqEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getCompareOperatorAccess().getInfeqEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:768:6: (enumLiteral_4= '=' )
                    {
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:768:6: (enumLiteral_4= '=' )
                    // ../org.varymde.cvlmappingvaribilitychoice/src-gen/org/varymde/parser/antlr/internal/InternalCvlmappingvaribilitychoice.g:768:8: enumLiteral_4= '='
                    {
                    enumLiteral_4=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleCompareOperator1683); 

                            current = grammarAccess.getCompareOperatorAccess().getEqEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getCompareOperatorAccess().getEqEnumLiteralDeclaration_4()); 
                        

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

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_ruleRestrictionRuleset_in_entryRuleRestrictionRuleset75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRestrictionRuleset85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRestrictionRuleset131 = new BitSet(new long[]{0x0000000000000800L});
        public static final BitSet FOLLOW_11_in_ruleRestrictionRuleset143 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleRestrictionRule_in_ruleRestrictionRuleset165 = new BitSet(new long[]{0x0000000000001030L});
        public static final BitSet FOLLOW_ruleRestrictionRule_in_ruleRestrictionRuleset186 = new BitSet(new long[]{0x0000000000001030L});
        public static final BitSet FOLLOW_12_in_ruleRestrictionRuleset200 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRestrictionRule_in_entryRuleRestrictionRule236 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRestrictionRule246 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_ruleRestrictionRule292 = new BitSet(new long[]{0x0000000000002000L});
        public static final BitSet FOLLOW_13_in_ruleRestrictionRule304 = new BitSet(new long[]{0x0000000000428000L});
        public static final BitSet FOLLOW_ruleBinExpression_in_ruleRestrictionRule325 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_ruleRestrictionRule337 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleBinExpression_in_entryRuleBinExpression373 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleBinExpression383 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleBinExpression430 = new BitSet(new long[]{0x0000000000380002L});
        public static final BitSet FOLLOW_ruleOperator_in_ruleBinExpression460 = new BitSet(new long[]{0x0000000000428000L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_ruleBinExpression481 = new BitSet(new long[]{0x0000000000380002L});
        public static final BitSet FOLLOW_rulePrimaryExpression_in_entryRulePrimaryExpression519 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePrimaryExpression529 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperator_in_rulePrimaryExpression585 = new BitSet(new long[]{0x0000000000428000L});
        public static final BitSet FOLLOW_ruleHasChoice_in_rulePrimaryExpression606 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleUnaryOperator_in_rulePrimaryExpression645 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePrimaryExpression657 = new BitSet(new long[]{0x0000000000428000L});
        public static final BitSet FOLLOW_ruleBinExpression_in_rulePrimaryExpression678 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePrimaryExpression691 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_rulePrimaryExpression721 = new BitSet(new long[]{0x0000000000428000L});
        public static final BitSet FOLLOW_ruleBinExpression_in_rulePrimaryExpression742 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePrimaryExpression755 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHasChoice_in_rulePrimaryExpression784 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleHasChoice_in_entryRuleHasChoice819 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleHasChoice829 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_17_in_ruleHasChoice866 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleHasChoice887 = new BitSet(new long[]{0x0000000000040002L});
        public static final BitSet FOLLOW_18_in_ruleHasChoice900 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_ruleCondition_in_ruleHasChoice921 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCondition_in_entryRuleCondition959 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCondition969 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditionExpression_in_ruleCondition1015 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString1050 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString1061 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString1101 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString1127 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleValue_in_entryRuleValue1173 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleValue1184 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleValue1224 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleValue1250 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleValue1276 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleConditionExpression_in_entryRuleConditionExpression1321 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleConditionExpression1331 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_15_in_ruleConditionExpression1368 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleConditionExpression1389 = new BitSet(new long[]{0x000000000F800000L});
        public static final BitSet FOLLOW_ruleCompareOperator_in_ruleConditionExpression1410 = new BitSet(new long[]{0x0000000000000070L});
        public static final BitSet FOLLOW_ruleValue_in_ruleConditionExpression1431 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_ruleConditionExpression1443 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_19_in_ruleOperator1493 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_20_in_ruleOperator1510 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_21_in_ruleOperator1527 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_22_in_ruleUnaryOperator1571 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_23_in_ruleCompareOperator1615 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleCompareOperator1632 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_25_in_ruleCompareOperator1649 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleCompareOperator1666 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleCompareOperator1683 = new BitSet(new long[]{0x0000000000000002L});
    }


}