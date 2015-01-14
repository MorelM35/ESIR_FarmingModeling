package org.xtext.activity.parser.antlr.internal; 

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
import org.xtext.activity.services.ActGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalActParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PeriodicActivity'", "'{'", "'atelier'", "','", "'start'", "'from'", "'to'", "'end'", "'every'", "'allocate'", "'} ,'", "'rules'", "'}'", "'reserve'", "'for'", "'pre'", "'Atelier'", "'activity'", "'-'", "'Elevage'", "'Culture'", "'months'", "'days'", "'weeks'", "'years'", "'hours'"
    };
    public static final int RULE_STRING=5;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__33=33;
    public static final int T__12=12;
    public static final int T__34=34;
    public static final int T__13=13;
    public static final int T__35=35;
    public static final int T__14=14;
    public static final int T__36=36;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=6;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalActParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalActParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalActParser.tokenNames; }
    public String getGrammarFileName() { return "../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g"; }



     	private ActGrammarAccess grammarAccess;
     	
        public InternalActParser(TokenStream input, ActGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "PeriodicActivity";	
       	}
       	
       	@Override
       	protected ActGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRulePeriodicActivity"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:68:1: entryRulePeriodicActivity returns [EObject current=null] : iv_rulePeriodicActivity= rulePeriodicActivity EOF ;
    public final EObject entryRulePeriodicActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePeriodicActivity = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:69:2: (iv_rulePeriodicActivity= rulePeriodicActivity EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:70:2: iv_rulePeriodicActivity= rulePeriodicActivity EOF
            {
             newCompositeNode(grammarAccess.getPeriodicActivityRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePeriodicActivity_in_entryRulePeriodicActivity75);
            iv_rulePeriodicActivity=rulePeriodicActivity();

            state._fsp--;

             current =iv_rulePeriodicActivity; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePeriodicActivity85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePeriodicActivity"


    // $ANTLR start "rulePeriodicActivity"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:77:1: rulePeriodicActivity returns [EObject current=null] : ( () otherlv_1= 'PeriodicActivity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'atelier' ( ( ruleEString ) ) otherlv_6= ',' )? otherlv_7= 'start' otherlv_8= 'from' ( (lv_start_9_0= ruleDate ) ) otherlv_10= 'to' otherlv_11= 'end' ( (lv_end_12_0= ruleDate ) ) otherlv_13= ',' (otherlv_14= 'every' ( (lv_periodicityNumber_15_0= ruleEInt ) )? ( (lv_periodicityType_16_0= rulePeriodicity ) ) )? (otherlv_17= 'allocate' otherlv_18= '{' ( (lv_resAllocation_19_0= ruleResAllocation ) ) (otherlv_20= ',' ( (lv_resAllocation_21_0= ruleResAllocation ) ) )* otherlv_22= '} ,' )? (otherlv_23= 'rules' otherlv_24= '{' ( (lv_rule_25_0= ruleRule ) ) (otherlv_26= ',' ( (lv_rule_27_0= ruleRule ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) ;
    public final EObject rulePeriodicActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_8=null;
        Token otherlv_10=null;
        Token otherlv_11=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_23=null;
        Token otherlv_24=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_29=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_start_9_0 = null;

        EObject lv_end_12_0 = null;

        AntlrDatatypeRuleToken lv_periodicityNumber_15_0 = null;

        Enumerator lv_periodicityType_16_0 = null;

        EObject lv_resAllocation_19_0 = null;

        EObject lv_resAllocation_21_0 = null;

        EObject lv_rule_25_0 = null;

        EObject lv_rule_27_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:80:28: ( ( () otherlv_1= 'PeriodicActivity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'atelier' ( ( ruleEString ) ) otherlv_6= ',' )? otherlv_7= 'start' otherlv_8= 'from' ( (lv_start_9_0= ruleDate ) ) otherlv_10= 'to' otherlv_11= 'end' ( (lv_end_12_0= ruleDate ) ) otherlv_13= ',' (otherlv_14= 'every' ( (lv_periodicityNumber_15_0= ruleEInt ) )? ( (lv_periodicityType_16_0= rulePeriodicity ) ) )? (otherlv_17= 'allocate' otherlv_18= '{' ( (lv_resAllocation_19_0= ruleResAllocation ) ) (otherlv_20= ',' ( (lv_resAllocation_21_0= ruleResAllocation ) ) )* otherlv_22= '} ,' )? (otherlv_23= 'rules' otherlv_24= '{' ( (lv_rule_25_0= ruleRule ) ) (otherlv_26= ',' ( (lv_rule_27_0= ruleRule ) ) )* otherlv_28= '}' )? otherlv_29= '}' ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:81:1: ( () otherlv_1= 'PeriodicActivity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'atelier' ( ( ruleEString ) ) otherlv_6= ',' )? otherlv_7= 'start' otherlv_8= 'from' ( (lv_start_9_0= ruleDate ) ) otherlv_10= 'to' otherlv_11= 'end' ( (lv_end_12_0= ruleDate ) ) otherlv_13= ',' (otherlv_14= 'every' ( (lv_periodicityNumber_15_0= ruleEInt ) )? ( (lv_periodicityType_16_0= rulePeriodicity ) ) )? (otherlv_17= 'allocate' otherlv_18= '{' ( (lv_resAllocation_19_0= ruleResAllocation ) ) (otherlv_20= ',' ( (lv_resAllocation_21_0= ruleResAllocation ) ) )* otherlv_22= '} ,' )? (otherlv_23= 'rules' otherlv_24= '{' ( (lv_rule_25_0= ruleRule ) ) (otherlv_26= ',' ( (lv_rule_27_0= ruleRule ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:81:1: ( () otherlv_1= 'PeriodicActivity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'atelier' ( ( ruleEString ) ) otherlv_6= ',' )? otherlv_7= 'start' otherlv_8= 'from' ( (lv_start_9_0= ruleDate ) ) otherlv_10= 'to' otherlv_11= 'end' ( (lv_end_12_0= ruleDate ) ) otherlv_13= ',' (otherlv_14= 'every' ( (lv_periodicityNumber_15_0= ruleEInt ) )? ( (lv_periodicityType_16_0= rulePeriodicity ) ) )? (otherlv_17= 'allocate' otherlv_18= '{' ( (lv_resAllocation_19_0= ruleResAllocation ) ) (otherlv_20= ',' ( (lv_resAllocation_21_0= ruleResAllocation ) ) )* otherlv_22= '} ,' )? (otherlv_23= 'rules' otherlv_24= '{' ( (lv_rule_25_0= ruleRule ) ) (otherlv_26= ',' ( (lv_rule_27_0= ruleRule ) ) )* otherlv_28= '}' )? otherlv_29= '}' )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:81:2: () otherlv_1= 'PeriodicActivity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'atelier' ( ( ruleEString ) ) otherlv_6= ',' )? otherlv_7= 'start' otherlv_8= 'from' ( (lv_start_9_0= ruleDate ) ) otherlv_10= 'to' otherlv_11= 'end' ( (lv_end_12_0= ruleDate ) ) otherlv_13= ',' (otherlv_14= 'every' ( (lv_periodicityNumber_15_0= ruleEInt ) )? ( (lv_periodicityType_16_0= rulePeriodicity ) ) )? (otherlv_17= 'allocate' otherlv_18= '{' ( (lv_resAllocation_19_0= ruleResAllocation ) ) (otherlv_20= ',' ( (lv_resAllocation_21_0= ruleResAllocation ) ) )* otherlv_22= '} ,' )? (otherlv_23= 'rules' otherlv_24= '{' ( (lv_rule_25_0= ruleRule ) ) (otherlv_26= ',' ( (lv_rule_27_0= ruleRule ) ) )* otherlv_28= '}' )? otherlv_29= '}'
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:81:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:82:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPeriodicActivityAccess().getPeriodicActivityAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePeriodicActivity131); 

                	newLeafNode(otherlv_1, grammarAccess.getPeriodicActivityAccess().getPeriodicActivityKeyword_1());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:91:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:92:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:92:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:93:3: lv_name_2_0= ruleEString
            {
             
            	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getNameEStringParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePeriodicActivity152);
            lv_name_2_0=ruleEString();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
            	        }
                   		set(
                   			current, 
                   			"name",
                    		lv_name_2_0, 
                    		"EString");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_3=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePeriodicActivity164); 

                	newLeafNode(otherlv_3, grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_3());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:113:1: (otherlv_4= 'atelier' ( ( ruleEString ) ) otherlv_6= ',' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:113:3: otherlv_4= 'atelier' ( ( ruleEString ) ) otherlv_6= ','
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePeriodicActivity177); 

                        	newLeafNode(otherlv_4, grammarAccess.getPeriodicActivityAccess().getAtelierKeyword_4_0());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:117:1: ( ( ruleEString ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:118:1: ( ruleEString )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:118:1: ( ruleEString )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:119:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getPeriodicActivityRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getAtelierAtelierCrossReference_4_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_rulePeriodicActivity200);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    otherlv_6=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePeriodicActivity212); 

                        	newLeafNode(otherlv_6, grammarAccess.getPeriodicActivityAccess().getCommaKeyword_4_2());
                        

                    }
                    break;

            }

            otherlv_7=(Token)match(input,15,FollowSets000.FOLLOW_15_in_rulePeriodicActivity226); 

                	newLeafNode(otherlv_7, grammarAccess.getPeriodicActivityAccess().getStartKeyword_5());
                
            otherlv_8=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePeriodicActivity238); 

                	newLeafNode(otherlv_8, grammarAccess.getPeriodicActivityAccess().getFromKeyword_6());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:144:1: ( (lv_start_9_0= ruleDate ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:145:1: (lv_start_9_0= ruleDate )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:145:1: (lv_start_9_0= ruleDate )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:146:3: lv_start_9_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getStartDateParserRuleCall_7_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rulePeriodicActivity259);
            lv_start_9_0=ruleDate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
            	        }
                   		set(
                   			current, 
                   			"start",
                    		lv_start_9_0, 
                    		"Date");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_10=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePeriodicActivity271); 

                	newLeafNode(otherlv_10, grammarAccess.getPeriodicActivityAccess().getToKeyword_8());
                
            otherlv_11=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePeriodicActivity283); 

                	newLeafNode(otherlv_11, grammarAccess.getPeriodicActivityAccess().getEndKeyword_9());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:170:1: ( (lv_end_12_0= ruleDate ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:171:1: (lv_end_12_0= ruleDate )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:171:1: (lv_end_12_0= ruleDate )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:172:3: lv_end_12_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getEndDateParserRuleCall_10_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rulePeriodicActivity304);
            lv_end_12_0=ruleDate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
            	        }
                   		set(
                   			current, 
                   			"end",
                    		lv_end_12_0, 
                    		"Date");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_13=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePeriodicActivity316); 

                	newLeafNode(otherlv_13, grammarAccess.getPeriodicActivityAccess().getCommaKeyword_11());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:192:1: (otherlv_14= 'every' ( (lv_periodicityNumber_15_0= ruleEInt ) )? ( (lv_periodicityType_16_0= rulePeriodicity ) ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==19) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:192:3: otherlv_14= 'every' ( (lv_periodicityNumber_15_0= ruleEInt ) )? ( (lv_periodicityType_16_0= rulePeriodicity ) )
                    {
                    otherlv_14=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePeriodicActivity329); 

                        	newLeafNode(otherlv_14, grammarAccess.getPeriodicActivityAccess().getEveryKeyword_12_0());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:196:1: ( (lv_periodicityNumber_15_0= ruleEInt ) )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==RULE_INT||LA2_0==29) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:197:1: (lv_periodicityNumber_15_0= ruleEInt )
                            {
                            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:197:1: (lv_periodicityNumber_15_0= ruleEInt )
                            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:198:3: lv_periodicityNumber_15_0= ruleEInt
                            {
                             
                            	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getPeriodicityNumberEIntParserRuleCall_12_1_0()); 
                            	    
                            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_rulePeriodicActivity350);
                            lv_periodicityNumber_15_0=ruleEInt();

                            state._fsp--;


                            	        if (current==null) {
                            	            current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
                            	        }
                                   		set(
                                   			current, 
                                   			"periodicityNumber",
                                    		lv_periodicityNumber_15_0, 
                                    		"EInt");
                            	        afterParserOrEnumRuleCall();
                            	    

                            }


                            }
                            break;

                    }

                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:214:3: ( (lv_periodicityType_16_0= rulePeriodicity ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:215:1: (lv_periodicityType_16_0= rulePeriodicity )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:215:1: (lv_periodicityType_16_0= rulePeriodicity )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:216:3: lv_periodicityType_16_0= rulePeriodicity
                    {
                     
                    	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getPeriodicityTypePeriodicityEnumRuleCall_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_rulePeriodicity_in_rulePeriodicActivity372);
                    lv_periodicityType_16_0=rulePeriodicity();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
                    	        }
                           		set(
                           			current, 
                           			"periodicityType",
                            		lv_periodicityType_16_0, 
                            		"Periodicity");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:232:4: (otherlv_17= 'allocate' otherlv_18= '{' ( (lv_resAllocation_19_0= ruleResAllocation ) ) (otherlv_20= ',' ( (lv_resAllocation_21_0= ruleResAllocation ) ) )* otherlv_22= '} ,' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==20) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:232:6: otherlv_17= 'allocate' otherlv_18= '{' ( (lv_resAllocation_19_0= ruleResAllocation ) ) (otherlv_20= ',' ( (lv_resAllocation_21_0= ruleResAllocation ) ) )* otherlv_22= '} ,'
                    {
                    otherlv_17=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePeriodicActivity387); 

                        	newLeafNode(otherlv_17, grammarAccess.getPeriodicActivityAccess().getAllocateKeyword_13_0());
                        
                    otherlv_18=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePeriodicActivity399); 

                        	newLeafNode(otherlv_18, grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_13_1());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:240:1: ( (lv_resAllocation_19_0= ruleResAllocation ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:241:1: (lv_resAllocation_19_0= ruleResAllocation )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:241:1: (lv_resAllocation_19_0= ruleResAllocation )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:242:3: lv_resAllocation_19_0= ruleResAllocation
                    {
                     
                    	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getResAllocationResAllocationParserRuleCall_13_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleResAllocation_in_rulePeriodicActivity420);
                    lv_resAllocation_19_0=ruleResAllocation();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
                    	        }
                           		add(
                           			current, 
                           			"resAllocation",
                            		lv_resAllocation_19_0, 
                            		"ResAllocation");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:258:2: (otherlv_20= ',' ( (lv_resAllocation_21_0= ruleResAllocation ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:258:4: otherlv_20= ',' ( (lv_resAllocation_21_0= ruleResAllocation ) )
                    	    {
                    	    otherlv_20=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePeriodicActivity433); 

                    	        	newLeafNode(otherlv_20, grammarAccess.getPeriodicActivityAccess().getCommaKeyword_13_3_0());
                    	        
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:262:1: ( (lv_resAllocation_21_0= ruleResAllocation ) )
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:263:1: (lv_resAllocation_21_0= ruleResAllocation )
                    	    {
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:263:1: (lv_resAllocation_21_0= ruleResAllocation )
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:264:3: lv_resAllocation_21_0= ruleResAllocation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getResAllocationResAllocationParserRuleCall_13_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleResAllocation_in_rulePeriodicActivity454);
                    	    lv_resAllocation_21_0=ruleResAllocation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"resAllocation",
                    	            		lv_resAllocation_21_0, 
                    	            		"ResAllocation");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);

                    otherlv_22=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulePeriodicActivity468); 

                        	newLeafNode(otherlv_22, grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketSpaceCommaKeyword_13_4());
                        

                    }
                    break;

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:284:3: (otherlv_23= 'rules' otherlv_24= '{' ( (lv_rule_25_0= ruleRule ) ) (otherlv_26= ',' ( (lv_rule_27_0= ruleRule ) ) )* otherlv_28= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==22) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:284:5: otherlv_23= 'rules' otherlv_24= '{' ( (lv_rule_25_0= ruleRule ) ) (otherlv_26= ',' ( (lv_rule_27_0= ruleRule ) ) )* otherlv_28= '}'
                    {
                    otherlv_23=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePeriodicActivity483); 

                        	newLeafNode(otherlv_23, grammarAccess.getPeriodicActivityAccess().getRulesKeyword_14_0());
                        
                    otherlv_24=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePeriodicActivity495); 

                        	newLeafNode(otherlv_24, grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_14_1());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:292:1: ( (lv_rule_25_0= ruleRule ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:293:1: (lv_rule_25_0= ruleRule )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:293:1: (lv_rule_25_0= ruleRule )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:294:3: lv_rule_25_0= ruleRule
                    {
                     
                    	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getRuleRuleParserRuleCall_14_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRule_in_rulePeriodicActivity516);
                    lv_rule_25_0=ruleRule();

                    state._fsp--;


                    	        if (current==null) {
                    	            current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
                    	        }
                           		add(
                           			current, 
                           			"rule",
                            		lv_rule_25_0, 
                            		"Rule");
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }

                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:310:2: (otherlv_26= ',' ( (lv_rule_27_0= ruleRule ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:310:4: otherlv_26= ',' ( (lv_rule_27_0= ruleRule ) )
                    	    {
                    	    otherlv_26=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePeriodicActivity529); 

                    	        	newLeafNode(otherlv_26, grammarAccess.getPeriodicActivityAccess().getCommaKeyword_14_3_0());
                    	        
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:314:1: ( (lv_rule_27_0= ruleRule ) )
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:315:1: (lv_rule_27_0= ruleRule )
                    	    {
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:315:1: (lv_rule_27_0= ruleRule )
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:316:3: lv_rule_27_0= ruleRule
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getRuleRuleParserRuleCall_14_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRule_in_rulePeriodicActivity550);
                    	    lv_rule_27_0=ruleRule();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"rule",
                    	            		lv_rule_27_0, 
                    	            		"Rule");
                    	    	        afterParserOrEnumRuleCall();
                    	    	    

                    	    }


                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);

                    otherlv_28=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePeriodicActivity564); 

                        	newLeafNode(otherlv_28, grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_14_4());
                        

                    }
                    break;

            }

            otherlv_29=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePeriodicActivity578); 

                	newLeafNode(otherlv_29, grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_15());
                

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
    // $ANTLR end "rulePeriodicActivity"


    // $ANTLR start "entryRuleDate"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:350:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:351:2: (iv_ruleDate= ruleDate EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:352:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate616);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate626); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleDate"


    // $ANTLR start "ruleDate"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:359:1: ruleDate returns [EObject current=null] : ( () ( (lv_day_1_0= ruleEInt ) ) ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        AntlrDatatypeRuleToken lv_day_1_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:362:28: ( ( () ( (lv_day_1_0= ruleEInt ) ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:363:1: ( () ( (lv_day_1_0= ruleEInt ) ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:363:1: ( () ( (lv_day_1_0= ruleEInt ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:363:2: () ( (lv_day_1_0= ruleEInt ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:363:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:364:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDateAccess().getDateAction_0(),
                        current);
                

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:369:2: ( (lv_day_1_0= ruleEInt ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:370:1: (lv_day_1_0= ruleEInt )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:370:1: (lv_day_1_0= ruleEInt )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:371:3: lv_day_1_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getDateAccess().getDayEIntParserRuleCall_1_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleDate681);
            lv_day_1_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDateRule());
            	        }
                   		set(
                   			current, 
                   			"day",
                    		lv_day_1_0, 
                    		"EInt");
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
    // $ANTLR end "ruleDate"


    // $ANTLR start "entryRuleResAllocation"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:395:1: entryRuleResAllocation returns [EObject current=null] : iv_ruleResAllocation= ruleResAllocation EOF ;
    public final EObject entryRuleResAllocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResAllocation = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:396:2: (iv_ruleResAllocation= ruleResAllocation EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:397:2: iv_ruleResAllocation= ruleResAllocation EOF
            {
             newCompositeNode(grammarAccess.getResAllocationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleResAllocation_in_entryRuleResAllocation717);
            iv_ruleResAllocation=ruleResAllocation();

            state._fsp--;

             current =iv_ruleResAllocation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResAllocation727); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleResAllocation"


    // $ANTLR start "ruleResAllocation"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:404:1: ruleResAllocation returns [EObject current=null] : ( () otherlv_1= 'reserve' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'for' ( (lv_duree_4_0= ruleEInt ) ) ) ;
    public final EObject ruleResAllocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_duree_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:407:28: ( ( () otherlv_1= 'reserve' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'for' ( (lv_duree_4_0= ruleEInt ) ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:408:1: ( () otherlv_1= 'reserve' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'for' ( (lv_duree_4_0= ruleEInt ) ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:408:1: ( () otherlv_1= 'reserve' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'for' ( (lv_duree_4_0= ruleEInt ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:408:2: () otherlv_1= 'reserve' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'for' ( (lv_duree_4_0= ruleEInt ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:408:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:409:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getResAllocationAccess().getRessourceAllocationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,24,FollowSets000.FOLLOW_24_in_ruleResAllocation773); 

                	newLeafNode(otherlv_1, grammarAccess.getResAllocationAccess().getReserveKeyword_1());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:418:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:419:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:419:1: (otherlv_2= RULE_ID )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:420:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResAllocationRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleResAllocation793); 

            		newLeafNode(otherlv_2, grammarAccess.getResAllocationAccess().getRessourceRessourceCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,25,FollowSets000.FOLLOW_25_in_ruleResAllocation805); 

                	newLeafNode(otherlv_3, grammarAccess.getResAllocationAccess().getForKeyword_3());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:435:1: ( (lv_duree_4_0= ruleEInt ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:436:1: (lv_duree_4_0= ruleEInt )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:436:1: (lv_duree_4_0= ruleEInt )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:437:3: lv_duree_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getResAllocationAccess().getDureeEIntParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleResAllocation826);
            lv_duree_4_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getResAllocationRule());
            	        }
                   		set(
                   			current, 
                   			"duree",
                    		lv_duree_4_0, 
                    		"EInt");
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
    // $ANTLR end "ruleResAllocation"


    // $ANTLR start "entryRuleEString"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:461:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:462:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:463:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString863);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString874); 

            }

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:470:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:473:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:474:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:474:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==RULE_STRING) ) {
                alt8=1;
            }
            else if ( (LA8_0==RULE_ID) ) {
                alt8=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }
            switch (alt8) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:474:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString914); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:482:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString940); 

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


    // $ANTLR start "entryRuleRule"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:497:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:498:2: (iv_ruleRule= ruleRule EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:499:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_entryRuleRule985);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRule995); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleRule"


    // $ANTLR start "ruleRule"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:506:1: ruleRule returns [EObject current=null] : ( () (otherlv_1= 'pre' ( (lv_pre_2_0= rulePredicate ) ) )* ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_pre_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:509:28: ( ( () (otherlv_1= 'pre' ( (lv_pre_2_0= rulePredicate ) ) )* ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:510:1: ( () (otherlv_1= 'pre' ( (lv_pre_2_0= rulePredicate ) ) )* )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:510:1: ( () (otherlv_1= 'pre' ( (lv_pre_2_0= rulePredicate ) ) )* )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:510:2: () (otherlv_1= 'pre' ( (lv_pre_2_0= rulePredicate ) ) )*
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:510:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:511:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRuleAccess().getRuleAction_0(),
                        current);
                

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:516:2: (otherlv_1= 'pre' ( (lv_pre_2_0= rulePredicate ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==26) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:516:4: otherlv_1= 'pre' ( (lv_pre_2_0= rulePredicate ) )
            	    {
            	    otherlv_1=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleRule1042); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getPreKeyword_1_0());
            	        
            	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:520:1: ( (lv_pre_2_0= rulePredicate ) )
            	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:521:1: (lv_pre_2_0= rulePredicate )
            	    {
            	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:521:1: (lv_pre_2_0= rulePredicate )
            	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:522:3: lv_pre_2_0= rulePredicate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleAccess().getPrePredicateParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePredicate_in_ruleRule1063);
            	    lv_pre_2_0=rulePredicate();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getRuleRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"pre",
            	            		lv_pre_2_0, 
            	            		"Predicate");
            	    	        afterParserOrEnumRuleCall();
            	    	    

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
    // $ANTLR end "ruleRule"


    // $ANTLR start "entryRuleAtelier_Impl"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:546:1: entryRuleAtelier_Impl returns [EObject current=null] : iv_ruleAtelier_Impl= ruleAtelier_Impl EOF ;
    public final EObject entryRuleAtelier_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtelier_Impl = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:547:2: (iv_ruleAtelier_Impl= ruleAtelier_Impl EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:548:2: iv_ruleAtelier_Impl= ruleAtelier_Impl EOF
            {
             newCompositeNode(grammarAccess.getAtelier_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtelier_Impl_in_entryRuleAtelier_Impl1101);
            iv_ruleAtelier_Impl=ruleAtelier_Impl();

            state._fsp--;

             current =iv_ruleAtelier_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtelier_Impl1111); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAtelier_Impl"


    // $ANTLR start "ruleAtelier_Impl"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:555:1: ruleAtelier_Impl returns [EObject current=null] : ( () otherlv_1= 'Atelier' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleAtelier_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:558:28: ( ( () otherlv_1= 'Atelier' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:559:1: ( () otherlv_1= 'Atelier' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:559:1: ( () otherlv_1= 'Atelier' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:559:2: () otherlv_1= 'Atelier' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:559:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:560:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtelier_ImplAccess().getAtelierAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleAtelier_Impl1157); 

                	newLeafNode(otherlv_1, grammarAccess.getAtelier_ImplAccess().getAtelierKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAtelier_Impl1169); 

                	newLeafNode(otherlv_2, grammarAccess.getAtelier_ImplAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:573:1: (otherlv_3= 'activity' ( ( ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==28) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:573:3: otherlv_3= 'activity' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleAtelier_Impl1182); 

                        	newLeafNode(otherlv_3, grammarAccess.getAtelier_ImplAccess().getActivityKeyword_3_0());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:577:1: ( ( ruleEString ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:578:1: ( ruleEString )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:578:1: ( ruleEString )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:579:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtelier_ImplRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAtelier_ImplAccess().getActivityPeriodicActivityCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAtelier_Impl1205);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleAtelier_Impl1219); 

                	newLeafNode(otherlv_5, grammarAccess.getAtelier_ImplAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleAtelier_Impl"


    // $ANTLR start "entryRuleEInt"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:604:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:605:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:606:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1256);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1267); 

            }

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:613:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:616:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:617:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:617:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:617:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:617:2: (kw= '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==29) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:618:2: kw= '-'
                    {
                    kw=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleEInt1306); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1323); 

            		current.merge(this_INT_1);
                
             
                newLeafNode(this_INT_1, grammarAccess.getEIntAccess().getINTTerminalRuleCall_1()); 
                

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
    // $ANTLR end "ruleEInt"


    // $ANTLR start "entryRulePredicate"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:640:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:641:2: (iv_rulePredicate= rulePredicate EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:642:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicate_in_entryRulePredicate1370);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredicate1380); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRulePredicate"


    // $ANTLR start "rulePredicate"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:649:1: rulePredicate returns [EObject current=null] : () ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:652:28: ( () )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:653:1: ()
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:653:1: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:654:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPredicateAccess().getPredicatAction(),
                        current);
                

            }


            }

             leaveRule(); 
        }
        finally {
        }
        return current;
    }
    // $ANTLR end "rulePredicate"


    // $ANTLR start "entryRuleElevage"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:667:1: entryRuleElevage returns [EObject current=null] : iv_ruleElevage= ruleElevage EOF ;
    public final EObject entryRuleElevage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElevage = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:668:2: (iv_ruleElevage= ruleElevage EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:669:2: iv_ruleElevage= ruleElevage EOF
            {
             newCompositeNode(grammarAccess.getElevageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElevage_in_entryRuleElevage1448);
            iv_ruleElevage=ruleElevage();

            state._fsp--;

             current =iv_ruleElevage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElevage1458); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleElevage"


    // $ANTLR start "ruleElevage"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:676:1: ruleElevage returns [EObject current=null] : ( () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleElevage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:679:28: ( ( () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:680:1: ( () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:680:1: ( () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:680:2: () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:680:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:681:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getElevageAccess().getElevageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleElevage1504); 

                	newLeafNode(otherlv_1, grammarAccess.getElevageAccess().getElevageKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElevage1516); 

                	newLeafNode(otherlv_2, grammarAccess.getElevageAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:694:1: (otherlv_3= 'activity' ( ( ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==28) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:694:3: otherlv_3= 'activity' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleElevage1529); 

                        	newLeafNode(otherlv_3, grammarAccess.getElevageAccess().getActivityKeyword_3_0());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:698:1: ( ( ruleEString ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:699:1: ( ruleEString )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:699:1: ( ruleEString )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:700:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getElevageRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getElevageAccess().getActivityPeriodicActivityCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleElevage1552);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleElevage1566); 

                	newLeafNode(otherlv_5, grammarAccess.getElevageAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleElevage"


    // $ANTLR start "entryRuleCulture"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:725:1: entryRuleCulture returns [EObject current=null] : iv_ruleCulture= ruleCulture EOF ;
    public final EObject entryRuleCulture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCulture = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:726:2: (iv_ruleCulture= ruleCulture EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:727:2: iv_ruleCulture= ruleCulture EOF
            {
             newCompositeNode(grammarAccess.getCultureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCulture_in_entryRuleCulture1602);
            iv_ruleCulture=ruleCulture();

            state._fsp--;

             current =iv_ruleCulture; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCulture1612); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleCulture"


    // $ANTLR start "ruleCulture"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:734:1: ruleCulture returns [EObject current=null] : ( () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleCulture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:737:28: ( ( () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:738:1: ( () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:738:1: ( () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:738:2: () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:738:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:739:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCultureAccess().getCultureAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleCulture1658); 

                	newLeafNode(otherlv_1, grammarAccess.getCultureAccess().getCultureKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCulture1670); 

                	newLeafNode(otherlv_2, grammarAccess.getCultureAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:752:1: (otherlv_3= 'activity' ( ( ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==28) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:752:3: otherlv_3= 'activity' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleCulture1683); 

                        	newLeafNode(otherlv_3, grammarAccess.getCultureAccess().getActivityKeyword_3_0());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:756:1: ( ( ruleEString ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:757:1: ( ruleEString )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:757:1: ( ruleEString )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:758:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCultureRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCultureAccess().getActivityPeriodicActivityCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCulture1706);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,23,FollowSets000.FOLLOW_23_in_ruleCulture1720); 

                	newLeafNode(otherlv_5, grammarAccess.getCultureAccess().getRightCurlyBracketKeyword_4());
                

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
    // $ANTLR end "ruleCulture"


    // $ANTLR start "rulePeriodicity"
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:783:1: rulePeriodicity returns [Enumerator current=null] : ( (enumLiteral_0= 'months' ) | (enumLiteral_1= 'days' ) | (enumLiteral_2= 'weeks' ) | (enumLiteral_3= 'years' ) | (enumLiteral_4= 'hours' ) ) ;
    public final Enumerator rulePeriodicity() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;

         enterRule(); 
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:785:28: ( ( (enumLiteral_0= 'months' ) | (enumLiteral_1= 'days' ) | (enumLiteral_2= 'weeks' ) | (enumLiteral_3= 'years' ) | (enumLiteral_4= 'hours' ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:786:1: ( (enumLiteral_0= 'months' ) | (enumLiteral_1= 'days' ) | (enumLiteral_2= 'weeks' ) | (enumLiteral_3= 'years' ) | (enumLiteral_4= 'hours' ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:786:1: ( (enumLiteral_0= 'months' ) | (enumLiteral_1= 'days' ) | (enumLiteral_2= 'weeks' ) | (enumLiteral_3= 'years' ) | (enumLiteral_4= 'hours' ) )
            int alt14=5;
            switch ( input.LA(1) ) {
            case 32:
                {
                alt14=1;
                }
                break;
            case 33:
                {
                alt14=2;
                }
                break;
            case 34:
                {
                alt14=3;
                }
                break;
            case 35:
                {
                alt14=4;
                }
                break;
            case 36:
                {
                alt14=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }

            switch (alt14) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:786:2: (enumLiteral_0= 'months' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:786:2: (enumLiteral_0= 'months' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:786:4: enumLiteral_0= 'months'
                    {
                    enumLiteral_0=(Token)match(input,32,FollowSets000.FOLLOW_32_in_rulePeriodicity1770); 

                            current = grammarAccess.getPeriodicityAccess().getMonthsEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getPeriodicityAccess().getMonthsEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:792:6: (enumLiteral_1= 'days' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:792:6: (enumLiteral_1= 'days' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:792:8: enumLiteral_1= 'days'
                    {
                    enumLiteral_1=(Token)match(input,33,FollowSets000.FOLLOW_33_in_rulePeriodicity1787); 

                            current = grammarAccess.getPeriodicityAccess().getDaysEnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getPeriodicityAccess().getDaysEnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:798:6: (enumLiteral_2= 'weeks' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:798:6: (enumLiteral_2= 'weeks' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:798:8: enumLiteral_2= 'weeks'
                    {
                    enumLiteral_2=(Token)match(input,34,FollowSets000.FOLLOW_34_in_rulePeriodicity1804); 

                            current = grammarAccess.getPeriodicityAccess().getWeeksEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getPeriodicityAccess().getWeeksEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:804:6: (enumLiteral_3= 'years' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:804:6: (enumLiteral_3= 'years' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:804:8: enumLiteral_3= 'years'
                    {
                    enumLiteral_3=(Token)match(input,35,FollowSets000.FOLLOW_35_in_rulePeriodicity1821); 

                            current = grammarAccess.getPeriodicityAccess().getYearsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getPeriodicityAccess().getYearsEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:810:6: (enumLiteral_4= 'hours' )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:810:6: (enumLiteral_4= 'hours' )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:810:8: enumLiteral_4= 'hours'
                    {
                    enumLiteral_4=(Token)match(input,36,FollowSets000.FOLLOW_36_in_rulePeriodicity1838); 

                            current = grammarAccess.getPeriodicityAccess().getHoursEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getPeriodicityAccess().getHoursEnumLiteralDeclaration_4()); 
                        

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
    // $ANTLR end "rulePeriodicity"

    // Delegated rules


 

    
    private static class FollowSets000 {
        public static final BitSet FOLLOW_rulePeriodicActivity_in_entryRulePeriodicActivity75 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePeriodicActivity85 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_11_in_rulePeriodicActivity131 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePeriodicActivity152 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePeriodicActivity164 = new BitSet(new long[]{0x000000000000A000L});
        public static final BitSet FOLLOW_13_in_rulePeriodicActivity177 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_rulePeriodicActivity200 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_rulePeriodicActivity212 = new BitSet(new long[]{0x0000000000008000L});
        public static final BitSet FOLLOW_15_in_rulePeriodicActivity226 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePeriodicActivity238 = new BitSet(new long[]{0x0000000020000040L});
        public static final BitSet FOLLOW_ruleDate_in_rulePeriodicActivity259 = new BitSet(new long[]{0x0000000000020000L});
        public static final BitSet FOLLOW_17_in_rulePeriodicActivity271 = new BitSet(new long[]{0x0000000000040000L});
        public static final BitSet FOLLOW_18_in_rulePeriodicActivity283 = new BitSet(new long[]{0x0000000020000040L});
        public static final BitSet FOLLOW_ruleDate_in_rulePeriodicActivity304 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_rulePeriodicActivity316 = new BitSet(new long[]{0x0000000000D80000L});
        public static final BitSet FOLLOW_19_in_rulePeriodicActivity329 = new BitSet(new long[]{0x0000001F20000040L});
        public static final BitSet FOLLOW_ruleEInt_in_rulePeriodicActivity350 = new BitSet(new long[]{0x0000001F20000040L});
        public static final BitSet FOLLOW_rulePeriodicity_in_rulePeriodicActivity372 = new BitSet(new long[]{0x0000000000D00000L});
        public static final BitSet FOLLOW_20_in_rulePeriodicActivity387 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePeriodicActivity399 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleResAllocation_in_rulePeriodicActivity420 = new BitSet(new long[]{0x0000000000204000L});
        public static final BitSet FOLLOW_14_in_rulePeriodicActivity433 = new BitSet(new long[]{0x0000000001000000L});
        public static final BitSet FOLLOW_ruleResAllocation_in_rulePeriodicActivity454 = new BitSet(new long[]{0x0000000000204000L});
        public static final BitSet FOLLOW_21_in_rulePeriodicActivity468 = new BitSet(new long[]{0x0000000000C00000L});
        public static final BitSet FOLLOW_22_in_rulePeriodicActivity483 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePeriodicActivity495 = new BitSet(new long[]{0x0000000004804000L});
        public static final BitSet FOLLOW_ruleRule_in_rulePeriodicActivity516 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_14_in_rulePeriodicActivity529 = new BitSet(new long[]{0x0000000004804000L});
        public static final BitSet FOLLOW_ruleRule_in_rulePeriodicActivity550 = new BitSet(new long[]{0x0000000000804000L});
        public static final BitSet FOLLOW_23_in_rulePeriodicActivity564 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_rulePeriodicActivity578 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate616 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate626 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleDate681 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResAllocation_in_entryRuleResAllocation717 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResAllocation727 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_24_in_ruleResAllocation773 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleResAllocation793 = new BitSet(new long[]{0x0000000002000000L});
        public static final BitSet FOLLOW_25_in_ruleResAllocation805 = new BitSet(new long[]{0x0000000020000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleResAllocation826 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString863 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString874 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString914 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString940 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_entryRuleRule985 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRule995 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_26_in_ruleRule1042 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_rulePredicate_in_ruleRule1063 = new BitSet(new long[]{0x0000000004000002L});
        public static final BitSet FOLLOW_ruleAtelier_Impl_in_entryRuleAtelier_Impl1101 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtelier_Impl1111 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleAtelier_Impl1157 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAtelier_Impl1169 = new BitSet(new long[]{0x0000000010800000L});
        public static final BitSet FOLLOW_28_in_ruleAtelier_Impl1182 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAtelier_Impl1205 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleAtelier_Impl1219 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1256 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1267 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_29_in_ruleEInt1306 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1323 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate1370 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredicate1380 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElevage_in_entryRuleElevage1448 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElevage1458 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleElevage1504 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElevage1516 = new BitSet(new long[]{0x0000000010800000L});
        public static final BitSet FOLLOW_28_in_ruleElevage1529 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleElevage1552 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleElevage1566 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCulture_in_entryRuleCulture1602 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCulture1612 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleCulture1658 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCulture1670 = new BitSet(new long[]{0x0000000010800000L});
        public static final BitSet FOLLOW_28_in_ruleCulture1683 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCulture1706 = new BitSet(new long[]{0x0000000000800000L});
        public static final BitSet FOLLOW_23_in_ruleCulture1720 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_32_in_rulePeriodicity1770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_rulePeriodicity1787 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_rulePeriodicity1804 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_rulePeriodicity1821 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_36_in_rulePeriodicity1838 = new BitSet(new long[]{0x0000000000000002L});
    }


}