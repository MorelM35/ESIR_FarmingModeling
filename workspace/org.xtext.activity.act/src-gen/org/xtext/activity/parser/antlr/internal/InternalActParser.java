package org.xtext.activity.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
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
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_STRING", "RULE_INT", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'PeriodicActivity'", "'{'", "'atelier'", "','", "'start'", "'end'", "'every'", "'hour'", "'day'", "'week'", "'month'", "'year'", "'allocate'", "'} ,'", "'rules'", "'}'", "'from'", "'reserve'", "'for'", "'pre'", "'Atelier'", "'activity'", "'-'", "'Elevage'", "'Culture'"
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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:67:1: entryRulePeriodicActivity returns [EObject current=null] : iv_rulePeriodicActivity= rulePeriodicActivity EOF ;
    public final EObject entryRulePeriodicActivity() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePeriodicActivity = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:68:2: (iv_rulePeriodicActivity= rulePeriodicActivity EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:69:2: iv_rulePeriodicActivity= rulePeriodicActivity EOF
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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:76:1: rulePeriodicActivity returns [EObject current=null] : ( () otherlv_1= 'PeriodicActivity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'atelier' ( ( ruleEString ) ) otherlv_6= ',' )? otherlv_7= 'start' ( (lv_start_8_0= ruleDate ) ) otherlv_9= ',' otherlv_10= 'end' ( (lv_end_11_0= ruleDate ) ) otherlv_12= ',' (otherlv_13= 'every' (otherlv_14= 'hour' | otherlv_15= 'day' | otherlv_16= 'week' | otherlv_17= 'month' | otherlv_18= 'year' ) )? (otherlv_19= 'allocate' otherlv_20= '{' ( (lv_resAllocation_21_0= ruleResAllocation ) ) (otherlv_22= ',' ( (lv_resAllocation_23_0= ruleResAllocation ) ) )* otherlv_24= '} ,' )? (otherlv_25= 'rules' otherlv_26= '{' ( (lv_rule_27_0= ruleRule ) ) (otherlv_28= ',' ( (lv_rule_29_0= ruleRule ) ) )* otherlv_30= '}' )? otherlv_31= '}' ) ;
    public final EObject rulePeriodicActivity() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_3=null;
        Token otherlv_4=null;
        Token otherlv_6=null;
        Token otherlv_7=null;
        Token otherlv_9=null;
        Token otherlv_10=null;
        Token otherlv_12=null;
        Token otherlv_13=null;
        Token otherlv_14=null;
        Token otherlv_15=null;
        Token otherlv_16=null;
        Token otherlv_17=null;
        Token otherlv_18=null;
        Token otherlv_19=null;
        Token otherlv_20=null;
        Token otherlv_22=null;
        Token otherlv_24=null;
        Token otherlv_25=null;
        Token otherlv_26=null;
        Token otherlv_28=null;
        Token otherlv_30=null;
        Token otherlv_31=null;
        AntlrDatatypeRuleToken lv_name_2_0 = null;

        EObject lv_start_8_0 = null;

        EObject lv_end_11_0 = null;

        EObject lv_resAllocation_21_0 = null;

        EObject lv_resAllocation_23_0 = null;

        EObject lv_rule_27_0 = null;

        EObject lv_rule_29_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:79:28: ( ( () otherlv_1= 'PeriodicActivity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'atelier' ( ( ruleEString ) ) otherlv_6= ',' )? otherlv_7= 'start' ( (lv_start_8_0= ruleDate ) ) otherlv_9= ',' otherlv_10= 'end' ( (lv_end_11_0= ruleDate ) ) otherlv_12= ',' (otherlv_13= 'every' (otherlv_14= 'hour' | otherlv_15= 'day' | otherlv_16= 'week' | otherlv_17= 'month' | otherlv_18= 'year' ) )? (otherlv_19= 'allocate' otherlv_20= '{' ( (lv_resAllocation_21_0= ruleResAllocation ) ) (otherlv_22= ',' ( (lv_resAllocation_23_0= ruleResAllocation ) ) )* otherlv_24= '} ,' )? (otherlv_25= 'rules' otherlv_26= '{' ( (lv_rule_27_0= ruleRule ) ) (otherlv_28= ',' ( (lv_rule_29_0= ruleRule ) ) )* otherlv_30= '}' )? otherlv_31= '}' ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:80:1: ( () otherlv_1= 'PeriodicActivity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'atelier' ( ( ruleEString ) ) otherlv_6= ',' )? otherlv_7= 'start' ( (lv_start_8_0= ruleDate ) ) otherlv_9= ',' otherlv_10= 'end' ( (lv_end_11_0= ruleDate ) ) otherlv_12= ',' (otherlv_13= 'every' (otherlv_14= 'hour' | otherlv_15= 'day' | otherlv_16= 'week' | otherlv_17= 'month' | otherlv_18= 'year' ) )? (otherlv_19= 'allocate' otherlv_20= '{' ( (lv_resAllocation_21_0= ruleResAllocation ) ) (otherlv_22= ',' ( (lv_resAllocation_23_0= ruleResAllocation ) ) )* otherlv_24= '} ,' )? (otherlv_25= 'rules' otherlv_26= '{' ( (lv_rule_27_0= ruleRule ) ) (otherlv_28= ',' ( (lv_rule_29_0= ruleRule ) ) )* otherlv_30= '}' )? otherlv_31= '}' )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:80:1: ( () otherlv_1= 'PeriodicActivity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'atelier' ( ( ruleEString ) ) otherlv_6= ',' )? otherlv_7= 'start' ( (lv_start_8_0= ruleDate ) ) otherlv_9= ',' otherlv_10= 'end' ( (lv_end_11_0= ruleDate ) ) otherlv_12= ',' (otherlv_13= 'every' (otherlv_14= 'hour' | otherlv_15= 'day' | otherlv_16= 'week' | otherlv_17= 'month' | otherlv_18= 'year' ) )? (otherlv_19= 'allocate' otherlv_20= '{' ( (lv_resAllocation_21_0= ruleResAllocation ) ) (otherlv_22= ',' ( (lv_resAllocation_23_0= ruleResAllocation ) ) )* otherlv_24= '} ,' )? (otherlv_25= 'rules' otherlv_26= '{' ( (lv_rule_27_0= ruleRule ) ) (otherlv_28= ',' ( (lv_rule_29_0= ruleRule ) ) )* otherlv_30= '}' )? otherlv_31= '}' )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:80:2: () otherlv_1= 'PeriodicActivity' ( (lv_name_2_0= ruleEString ) ) otherlv_3= '{' (otherlv_4= 'atelier' ( ( ruleEString ) ) otherlv_6= ',' )? otherlv_7= 'start' ( (lv_start_8_0= ruleDate ) ) otherlv_9= ',' otherlv_10= 'end' ( (lv_end_11_0= ruleDate ) ) otherlv_12= ',' (otherlv_13= 'every' (otherlv_14= 'hour' | otherlv_15= 'day' | otherlv_16= 'week' | otherlv_17= 'month' | otherlv_18= 'year' ) )? (otherlv_19= 'allocate' otherlv_20= '{' ( (lv_resAllocation_21_0= ruleResAllocation ) ) (otherlv_22= ',' ( (lv_resAllocation_23_0= ruleResAllocation ) ) )* otherlv_24= '} ,' )? (otherlv_25= 'rules' otherlv_26= '{' ( (lv_rule_27_0= ruleRule ) ) (otherlv_28= ',' ( (lv_rule_29_0= ruleRule ) ) )* otherlv_30= '}' )? otherlv_31= '}'
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:80:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:81:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getPeriodicActivityAccess().getPeriodicActivityAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,11,FollowSets000.FOLLOW_11_in_rulePeriodicActivity131); 

                	newLeafNode(otherlv_1, grammarAccess.getPeriodicActivityAccess().getPeriodicActivityKeyword_1());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:90:1: ( (lv_name_2_0= ruleEString ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:91:1: (lv_name_2_0= ruleEString )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:91:1: (lv_name_2_0= ruleEString )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:92:3: lv_name_2_0= ruleEString
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
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:112:1: (otherlv_4= 'atelier' ( ( ruleEString ) ) otherlv_6= ',' )?
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0==13) ) {
                alt1=1;
            }
            switch (alt1) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:112:3: otherlv_4= 'atelier' ( ( ruleEString ) ) otherlv_6= ','
                    {
                    otherlv_4=(Token)match(input,13,FollowSets000.FOLLOW_13_in_rulePeriodicActivity177); 

                        	newLeafNode(otherlv_4, grammarAccess.getPeriodicActivityAccess().getAtelierKeyword_4_0());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:116:1: ( ( ruleEString ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:117:1: ( ruleEString )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:117:1: ( ruleEString )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:118:3: ruleEString
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
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:139:1: ( (lv_start_8_0= ruleDate ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:140:1: (lv_start_8_0= ruleDate )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:140:1: (lv_start_8_0= ruleDate )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:141:3: lv_start_8_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getStartDateParserRuleCall_6_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rulePeriodicActivity247);
            lv_start_8_0=ruleDate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
            	        }
                   		set(
                   			current, 
                   			"start",
                    		lv_start_8_0, 
                    		"Date");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_9=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePeriodicActivity259); 

                	newLeafNode(otherlv_9, grammarAccess.getPeriodicActivityAccess().getCommaKeyword_7());
                
            otherlv_10=(Token)match(input,16,FollowSets000.FOLLOW_16_in_rulePeriodicActivity271); 

                	newLeafNode(otherlv_10, grammarAccess.getPeriodicActivityAccess().getEndKeyword_8());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:165:1: ( (lv_end_11_0= ruleDate ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:166:1: (lv_end_11_0= ruleDate )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:166:1: (lv_end_11_0= ruleDate )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:167:3: lv_end_11_0= ruleDate
            {
             
            	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getEndDateParserRuleCall_9_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_rulePeriodicActivity292);
            lv_end_11_0=ruleDate();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
            	        }
                   		set(
                   			current, 
                   			"end",
                    		lv_end_11_0, 
                    		"Date");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }

            otherlv_12=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePeriodicActivity304); 

                	newLeafNode(otherlv_12, grammarAccess.getPeriodicActivityAccess().getCommaKeyword_10());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:187:1: (otherlv_13= 'every' (otherlv_14= 'hour' | otherlv_15= 'day' | otherlv_16= 'week' | otherlv_17= 'month' | otherlv_18= 'year' ) )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==17) ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:187:3: otherlv_13= 'every' (otherlv_14= 'hour' | otherlv_15= 'day' | otherlv_16= 'week' | otherlv_17= 'month' | otherlv_18= 'year' )
                    {
                    otherlv_13=(Token)match(input,17,FollowSets000.FOLLOW_17_in_rulePeriodicActivity317); 

                        	newLeafNode(otherlv_13, grammarAccess.getPeriodicActivityAccess().getEveryKeyword_11_0());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:191:1: (otherlv_14= 'hour' | otherlv_15= 'day' | otherlv_16= 'week' | otherlv_17= 'month' | otherlv_18= 'year' )
                    int alt2=5;
                    switch ( input.LA(1) ) {
                    case 18:
                        {
                        alt2=1;
                        }
                        break;
                    case 19:
                        {
                        alt2=2;
                        }
                        break;
                    case 20:
                        {
                        alt2=3;
                        }
                        break;
                    case 21:
                        {
                        alt2=4;
                        }
                        break;
                    case 22:
                        {
                        alt2=5;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 2, 0, input);

                        throw nvae;
                    }

                    switch (alt2) {
                        case 1 :
                            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:191:3: otherlv_14= 'hour'
                            {
                            otherlv_14=(Token)match(input,18,FollowSets000.FOLLOW_18_in_rulePeriodicActivity330); 

                                	newLeafNode(otherlv_14, grammarAccess.getPeriodicActivityAccess().getHourKeyword_11_1_0());
                                

                            }
                            break;
                        case 2 :
                            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:196:7: otherlv_15= 'day'
                            {
                            otherlv_15=(Token)match(input,19,FollowSets000.FOLLOW_19_in_rulePeriodicActivity348); 

                                	newLeafNode(otherlv_15, grammarAccess.getPeriodicActivityAccess().getDayKeyword_11_1_1());
                                

                            }
                            break;
                        case 3 :
                            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:201:7: otherlv_16= 'week'
                            {
                            otherlv_16=(Token)match(input,20,FollowSets000.FOLLOW_20_in_rulePeriodicActivity366); 

                                	newLeafNode(otherlv_16, grammarAccess.getPeriodicActivityAccess().getWeekKeyword_11_1_2());
                                

                            }
                            break;
                        case 4 :
                            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:206:7: otherlv_17= 'month'
                            {
                            otherlv_17=(Token)match(input,21,FollowSets000.FOLLOW_21_in_rulePeriodicActivity384); 

                                	newLeafNode(otherlv_17, grammarAccess.getPeriodicActivityAccess().getMonthKeyword_11_1_3());
                                

                            }
                            break;
                        case 5 :
                            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:211:7: otherlv_18= 'year'
                            {
                            otherlv_18=(Token)match(input,22,FollowSets000.FOLLOW_22_in_rulePeriodicActivity402); 

                                	newLeafNode(otherlv_18, grammarAccess.getPeriodicActivityAccess().getYearKeyword_11_1_4());
                                

                            }
                            break;

                    }


                    }
                    break;

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:215:4: (otherlv_19= 'allocate' otherlv_20= '{' ( (lv_resAllocation_21_0= ruleResAllocation ) ) (otherlv_22= ',' ( (lv_resAllocation_23_0= ruleResAllocation ) ) )* otherlv_24= '} ,' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==23) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:215:6: otherlv_19= 'allocate' otherlv_20= '{' ( (lv_resAllocation_21_0= ruleResAllocation ) ) (otherlv_22= ',' ( (lv_resAllocation_23_0= ruleResAllocation ) ) )* otherlv_24= '} ,'
                    {
                    otherlv_19=(Token)match(input,23,FollowSets000.FOLLOW_23_in_rulePeriodicActivity418); 

                        	newLeafNode(otherlv_19, grammarAccess.getPeriodicActivityAccess().getAllocateKeyword_12_0());
                        
                    otherlv_20=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePeriodicActivity430); 

                        	newLeafNode(otherlv_20, grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_12_1());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:223:1: ( (lv_resAllocation_21_0= ruleResAllocation ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:224:1: (lv_resAllocation_21_0= ruleResAllocation )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:224:1: (lv_resAllocation_21_0= ruleResAllocation )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:225:3: lv_resAllocation_21_0= ruleResAllocation
                    {
                     
                    	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getResAllocationResAllocationParserRuleCall_12_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleResAllocation_in_rulePeriodicActivity451);
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

                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:241:2: (otherlv_22= ',' ( (lv_resAllocation_23_0= ruleResAllocation ) ) )*
                    loop4:
                    do {
                        int alt4=2;
                        int LA4_0 = input.LA(1);

                        if ( (LA4_0==14) ) {
                            alt4=1;
                        }


                        switch (alt4) {
                    	case 1 :
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:241:4: otherlv_22= ',' ( (lv_resAllocation_23_0= ruleResAllocation ) )
                    	    {
                    	    otherlv_22=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePeriodicActivity464); 

                    	        	newLeafNode(otherlv_22, grammarAccess.getPeriodicActivityAccess().getCommaKeyword_12_3_0());
                    	        
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:245:1: ( (lv_resAllocation_23_0= ruleResAllocation ) )
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:246:1: (lv_resAllocation_23_0= ruleResAllocation )
                    	    {
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:246:1: (lv_resAllocation_23_0= ruleResAllocation )
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:247:3: lv_resAllocation_23_0= ruleResAllocation
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getResAllocationResAllocationParserRuleCall_12_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleResAllocation_in_rulePeriodicActivity485);
                    	    lv_resAllocation_23_0=ruleResAllocation();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"resAllocation",
                    	            		lv_resAllocation_23_0, 
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

                    otherlv_24=(Token)match(input,24,FollowSets000.FOLLOW_24_in_rulePeriodicActivity499); 

                        	newLeafNode(otherlv_24, grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketSpaceCommaKeyword_12_4());
                        

                    }
                    break;

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:267:3: (otherlv_25= 'rules' otherlv_26= '{' ( (lv_rule_27_0= ruleRule ) ) (otherlv_28= ',' ( (lv_rule_29_0= ruleRule ) ) )* otherlv_30= '}' )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==25) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:267:5: otherlv_25= 'rules' otherlv_26= '{' ( (lv_rule_27_0= ruleRule ) ) (otherlv_28= ',' ( (lv_rule_29_0= ruleRule ) ) )* otherlv_30= '}'
                    {
                    otherlv_25=(Token)match(input,25,FollowSets000.FOLLOW_25_in_rulePeriodicActivity514); 

                        	newLeafNode(otherlv_25, grammarAccess.getPeriodicActivityAccess().getRulesKeyword_13_0());
                        
                    otherlv_26=(Token)match(input,12,FollowSets000.FOLLOW_12_in_rulePeriodicActivity526); 

                        	newLeafNode(otherlv_26, grammarAccess.getPeriodicActivityAccess().getLeftCurlyBracketKeyword_13_1());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:275:1: ( (lv_rule_27_0= ruleRule ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:276:1: (lv_rule_27_0= ruleRule )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:276:1: (lv_rule_27_0= ruleRule )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:277:3: lv_rule_27_0= ruleRule
                    {
                     
                    	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getRuleRuleParserRuleCall_13_2_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleRule_in_rulePeriodicActivity547);
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

                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:293:2: (otherlv_28= ',' ( (lv_rule_29_0= ruleRule ) ) )*
                    loop6:
                    do {
                        int alt6=2;
                        int LA6_0 = input.LA(1);

                        if ( (LA6_0==14) ) {
                            alt6=1;
                        }


                        switch (alt6) {
                    	case 1 :
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:293:4: otherlv_28= ',' ( (lv_rule_29_0= ruleRule ) )
                    	    {
                    	    otherlv_28=(Token)match(input,14,FollowSets000.FOLLOW_14_in_rulePeriodicActivity560); 

                    	        	newLeafNode(otherlv_28, grammarAccess.getPeriodicActivityAccess().getCommaKeyword_13_3_0());
                    	        
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:297:1: ( (lv_rule_29_0= ruleRule ) )
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:298:1: (lv_rule_29_0= ruleRule )
                    	    {
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:298:1: (lv_rule_29_0= ruleRule )
                    	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:299:3: lv_rule_29_0= ruleRule
                    	    {
                    	     
                    	    	        newCompositeNode(grammarAccess.getPeriodicActivityAccess().getRuleRuleParserRuleCall_13_3_1_0()); 
                    	    	    
                    	    pushFollow(FollowSets000.FOLLOW_ruleRule_in_rulePeriodicActivity581);
                    	    lv_rule_29_0=ruleRule();

                    	    state._fsp--;


                    	    	        if (current==null) {
                    	    	            current = createModelElementForParent(grammarAccess.getPeriodicActivityRule());
                    	    	        }
                    	           		add(
                    	           			current, 
                    	           			"rule",
                    	            		lv_rule_29_0, 
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

                    otherlv_30=(Token)match(input,26,FollowSets000.FOLLOW_26_in_rulePeriodicActivity595); 

                        	newLeafNode(otherlv_30, grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_13_4());
                        

                    }
                    break;

            }

            otherlv_31=(Token)match(input,26,FollowSets000.FOLLOW_26_in_rulePeriodicActivity609); 

                	newLeafNode(otherlv_31, grammarAccess.getPeriodicActivityAccess().getRightCurlyBracketKeyword_14());
                

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:333:1: entryRuleDate returns [EObject current=null] : iv_ruleDate= ruleDate EOF ;
    public final EObject entryRuleDate() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleDate = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:334:2: (iv_ruleDate= ruleDate EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:335:2: iv_ruleDate= ruleDate EOF
            {
             newCompositeNode(grammarAccess.getDateRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleDate_in_entryRuleDate647);
            iv_ruleDate=ruleDate();

            state._fsp--;

             current =iv_ruleDate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleDate657); 

            }

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:342:1: ruleDate returns [EObject current=null] : ( () otherlv_1= 'from' ( (lv_day_2_0= ruleEInt ) ) ) ;
    public final EObject ruleDate() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        AntlrDatatypeRuleToken lv_day_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:345:28: ( ( () otherlv_1= 'from' ( (lv_day_2_0= ruleEInt ) ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:346:1: ( () otherlv_1= 'from' ( (lv_day_2_0= ruleEInt ) ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:346:1: ( () otherlv_1= 'from' ( (lv_day_2_0= ruleEInt ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:346:2: () otherlv_1= 'from' ( (lv_day_2_0= ruleEInt ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:346:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:347:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getDateAccess().getDateAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,27,FollowSets000.FOLLOW_27_in_ruleDate703); 

                	newLeafNode(otherlv_1, grammarAccess.getDateAccess().getFromKeyword_1());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:356:1: ( (lv_day_2_0= ruleEInt ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:357:1: (lv_day_2_0= ruleEInt )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:357:1: (lv_day_2_0= ruleEInt )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:358:3: lv_day_2_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getDateAccess().getDayEIntParserRuleCall_2_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleDate724);
            lv_day_2_0=ruleEInt();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getDateRule());
            	        }
                   		set(
                   			current, 
                   			"day",
                    		lv_day_2_0, 
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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:382:1: entryRuleResAllocation returns [EObject current=null] : iv_ruleResAllocation= ruleResAllocation EOF ;
    public final EObject entryRuleResAllocation() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleResAllocation = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:383:2: (iv_ruleResAllocation= ruleResAllocation EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:384:2: iv_ruleResAllocation= ruleResAllocation EOF
            {
             newCompositeNode(grammarAccess.getResAllocationRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleResAllocation_in_entryRuleResAllocation760);
            iv_ruleResAllocation=ruleResAllocation();

            state._fsp--;

             current =iv_ruleResAllocation; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleResAllocation770); 

            }

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:391:1: ruleResAllocation returns [EObject current=null] : ( () otherlv_1= 'reserve' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'for' ( (lv_duree_4_0= ruleEInt ) ) ) ;
    public final EObject ruleResAllocation() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        AntlrDatatypeRuleToken lv_duree_4_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:394:28: ( ( () otherlv_1= 'reserve' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'for' ( (lv_duree_4_0= ruleEInt ) ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:395:1: ( () otherlv_1= 'reserve' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'for' ( (lv_duree_4_0= ruleEInt ) ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:395:1: ( () otherlv_1= 'reserve' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'for' ( (lv_duree_4_0= ruleEInt ) ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:395:2: () otherlv_1= 'reserve' ( (otherlv_2= RULE_ID ) ) otherlv_3= 'for' ( (lv_duree_4_0= ruleEInt ) )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:395:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:396:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getResAllocationAccess().getRessourceAllocationAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,28,FollowSets000.FOLLOW_28_in_ruleResAllocation816); 

                	newLeafNode(otherlv_1, grammarAccess.getResAllocationAccess().getReserveKeyword_1());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:405:1: ( (otherlv_2= RULE_ID ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:406:1: (otherlv_2= RULE_ID )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:406:1: (otherlv_2= RULE_ID )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:407:3: otherlv_2= RULE_ID
            {

            			if (current==null) {
            	            current = createModelElement(grammarAccess.getResAllocationRule());
            	        }
                    
            otherlv_2=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleResAllocation836); 

            		newLeafNode(otherlv_2, grammarAccess.getResAllocationAccess().getRessourceRessourceCrossReference_2_0()); 
            	

            }


            }

            otherlv_3=(Token)match(input,29,FollowSets000.FOLLOW_29_in_ruleResAllocation848); 

                	newLeafNode(otherlv_3, grammarAccess.getResAllocationAccess().getForKeyword_3());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:422:1: ( (lv_duree_4_0= ruleEInt ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:423:1: (lv_duree_4_0= ruleEInt )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:423:1: (lv_duree_4_0= ruleEInt )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:424:3: lv_duree_4_0= ruleEInt
            {
             
            	        newCompositeNode(grammarAccess.getResAllocationAccess().getDureeEIntParserRuleCall_4_0()); 
            	    
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_ruleResAllocation869);
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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:448:1: entryRuleEString returns [String current=null] : iv_ruleEString= ruleEString EOF ;
    public final String entryRuleEString() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEString = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:449:2: (iv_ruleEString= ruleEString EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:450:2: iv_ruleEString= ruleEString EOF
            {
             newCompositeNode(grammarAccess.getEStringRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEString_in_entryRuleEString906);
            iv_ruleEString=ruleEString();

            state._fsp--;

             current =iv_ruleEString.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEString917); 

            }

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:457:1: ruleEString returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) ;
    public final AntlrDatatypeRuleToken ruleEString() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token this_STRING_0=null;
        Token this_ID_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:460:28: ( (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:461:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:461:1: (this_STRING_0= RULE_STRING | this_ID_1= RULE_ID )
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
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:461:6: this_STRING_0= RULE_STRING
                    {
                    this_STRING_0=(Token)match(input,RULE_STRING,FollowSets000.FOLLOW_RULE_STRING_in_ruleEString957); 

                    		current.merge(this_STRING_0);
                        
                     
                        newLeafNode(this_STRING_0, grammarAccess.getEStringAccess().getSTRINGTerminalRuleCall_0()); 
                        

                    }
                    break;
                case 2 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:469:10: this_ID_1= RULE_ID
                    {
                    this_ID_1=(Token)match(input,RULE_ID,FollowSets000.FOLLOW_RULE_ID_in_ruleEString983); 

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:484:1: entryRuleRule returns [EObject current=null] : iv_ruleRule= ruleRule EOF ;
    public final EObject entryRuleRule() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleRule = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:485:2: (iv_ruleRule= ruleRule EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:486:2: iv_ruleRule= ruleRule EOF
            {
             newCompositeNode(grammarAccess.getRuleRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleRule_in_entryRuleRule1028);
            iv_ruleRule=ruleRule();

            state._fsp--;

             current =iv_ruleRule; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleRule1038); 

            }

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:493:1: ruleRule returns [EObject current=null] : ( () (otherlv_1= 'pre' ( (lv_pre_2_0= rulePredicate ) ) )* ) ;
    public final EObject ruleRule() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        EObject lv_pre_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:496:28: ( ( () (otherlv_1= 'pre' ( (lv_pre_2_0= rulePredicate ) ) )* ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:497:1: ( () (otherlv_1= 'pre' ( (lv_pre_2_0= rulePredicate ) ) )* )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:497:1: ( () (otherlv_1= 'pre' ( (lv_pre_2_0= rulePredicate ) ) )* )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:497:2: () (otherlv_1= 'pre' ( (lv_pre_2_0= rulePredicate ) ) )*
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:497:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:498:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getRuleAccess().getRuleAction_0(),
                        current);
                

            }

            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:503:2: (otherlv_1= 'pre' ( (lv_pre_2_0= rulePredicate ) ) )*
            loop9:
            do {
                int alt9=2;
                int LA9_0 = input.LA(1);

                if ( (LA9_0==30) ) {
                    alt9=1;
                }


                switch (alt9) {
            	case 1 :
            	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:503:4: otherlv_1= 'pre' ( (lv_pre_2_0= rulePredicate ) )
            	    {
            	    otherlv_1=(Token)match(input,30,FollowSets000.FOLLOW_30_in_ruleRule1085); 

            	        	newLeafNode(otherlv_1, grammarAccess.getRuleAccess().getPreKeyword_1_0());
            	        
            	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:507:1: ( (lv_pre_2_0= rulePredicate ) )
            	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:508:1: (lv_pre_2_0= rulePredicate )
            	    {
            	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:508:1: (lv_pre_2_0= rulePredicate )
            	    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:509:3: lv_pre_2_0= rulePredicate
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getRuleAccess().getPrePredicateParserRuleCall_1_1_0()); 
            	    	    
            	    pushFollow(FollowSets000.FOLLOW_rulePredicate_in_ruleRule1106);
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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:533:1: entryRuleAtelier_Impl returns [EObject current=null] : iv_ruleAtelier_Impl= ruleAtelier_Impl EOF ;
    public final EObject entryRuleAtelier_Impl() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAtelier_Impl = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:534:2: (iv_ruleAtelier_Impl= ruleAtelier_Impl EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:535:2: iv_ruleAtelier_Impl= ruleAtelier_Impl EOF
            {
             newCompositeNode(grammarAccess.getAtelier_ImplRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleAtelier_Impl_in_entryRuleAtelier_Impl1144);
            iv_ruleAtelier_Impl=ruleAtelier_Impl();

            state._fsp--;

             current =iv_ruleAtelier_Impl; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleAtelier_Impl1154); 

            }

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:542:1: ruleAtelier_Impl returns [EObject current=null] : ( () otherlv_1= 'Atelier' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleAtelier_Impl() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:545:28: ( ( () otherlv_1= 'Atelier' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:546:1: ( () otherlv_1= 'Atelier' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:546:1: ( () otherlv_1= 'Atelier' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:546:2: () otherlv_1= 'Atelier' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:546:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:547:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getAtelier_ImplAccess().getAtelierAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,31,FollowSets000.FOLLOW_31_in_ruleAtelier_Impl1200); 

                	newLeafNode(otherlv_1, grammarAccess.getAtelier_ImplAccess().getAtelierKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleAtelier_Impl1212); 

                	newLeafNode(otherlv_2, grammarAccess.getAtelier_ImplAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:560:1: (otherlv_3= 'activity' ( ( ruleEString ) ) )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==32) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:560:3: otherlv_3= 'activity' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleAtelier_Impl1225); 

                        	newLeafNode(otherlv_3, grammarAccess.getAtelier_ImplAccess().getActivityKeyword_3_0());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:564:1: ( ( ruleEString ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:565:1: ( ruleEString )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:565:1: ( ruleEString )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:566:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getAtelier_ImplRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getAtelier_ImplAccess().getActivityPeriodicActivityCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleAtelier_Impl1248);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleAtelier_Impl1262); 

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:591:1: entryRuleEInt returns [String current=null] : iv_ruleEInt= ruleEInt EOF ;
    public final String entryRuleEInt() throws RecognitionException {
        String current = null;

        AntlrDatatypeRuleToken iv_ruleEInt = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:592:2: (iv_ruleEInt= ruleEInt EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:593:2: iv_ruleEInt= ruleEInt EOF
            {
             newCompositeNode(grammarAccess.getEIntRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleEInt_in_entryRuleEInt1299);
            iv_ruleEInt=ruleEInt();

            state._fsp--;

             current =iv_ruleEInt.getText(); 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleEInt1310); 

            }

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:600:1: ruleEInt returns [AntlrDatatypeRuleToken current=new AntlrDatatypeRuleToken()] : ( (kw= '-' )? this_INT_1= RULE_INT ) ;
    public final AntlrDatatypeRuleToken ruleEInt() throws RecognitionException {
        AntlrDatatypeRuleToken current = new AntlrDatatypeRuleToken();

        Token kw=null;
        Token this_INT_1=null;

         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:603:28: ( ( (kw= '-' )? this_INT_1= RULE_INT ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:604:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:604:1: ( (kw= '-' )? this_INT_1= RULE_INT )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:604:2: (kw= '-' )? this_INT_1= RULE_INT
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:604:2: (kw= '-' )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==33) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:605:2: kw= '-'
                    {
                    kw=(Token)match(input,33,FollowSets000.FOLLOW_33_in_ruleEInt1349); 

                            current.merge(kw);
                            newLeafNode(kw, grammarAccess.getEIntAccess().getHyphenMinusKeyword_0()); 
                        

                    }
                    break;

            }

            this_INT_1=(Token)match(input,RULE_INT,FollowSets000.FOLLOW_RULE_INT_in_ruleEInt1366); 

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:627:1: entryRulePredicate returns [EObject current=null] : iv_rulePredicate= rulePredicate EOF ;
    public final EObject entryRulePredicate() throws RecognitionException {
        EObject current = null;

        EObject iv_rulePredicate = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:628:2: (iv_rulePredicate= rulePredicate EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:629:2: iv_rulePredicate= rulePredicate EOF
            {
             newCompositeNode(grammarAccess.getPredicateRule()); 
            pushFollow(FollowSets000.FOLLOW_rulePredicate_in_entryRulePredicate1413);
            iv_rulePredicate=rulePredicate();

            state._fsp--;

             current =iv_rulePredicate; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRulePredicate1423); 

            }

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:636:1: rulePredicate returns [EObject current=null] : () ;
    public final EObject rulePredicate() throws RecognitionException {
        EObject current = null;

         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:639:28: ( () )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:640:1: ()
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:640:1: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:641:5: 
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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:654:1: entryRuleElevage returns [EObject current=null] : iv_ruleElevage= ruleElevage EOF ;
    public final EObject entryRuleElevage() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleElevage = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:655:2: (iv_ruleElevage= ruleElevage EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:656:2: iv_ruleElevage= ruleElevage EOF
            {
             newCompositeNode(grammarAccess.getElevageRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleElevage_in_entryRuleElevage1491);
            iv_ruleElevage=ruleElevage();

            state._fsp--;

             current =iv_ruleElevage; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleElevage1501); 

            }

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:663:1: ruleElevage returns [EObject current=null] : ( () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleElevage() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:666:28: ( ( () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:667:1: ( () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:667:1: ( () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:667:2: () otherlv_1= 'Elevage' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:667:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:668:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getElevageAccess().getElevageAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,34,FollowSets000.FOLLOW_34_in_ruleElevage1547); 

                	newLeafNode(otherlv_1, grammarAccess.getElevageAccess().getElevageKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleElevage1559); 

                	newLeafNode(otherlv_2, grammarAccess.getElevageAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:681:1: (otherlv_3= 'activity' ( ( ruleEString ) ) )?
            int alt12=2;
            int LA12_0 = input.LA(1);

            if ( (LA12_0==32) ) {
                alt12=1;
            }
            switch (alt12) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:681:3: otherlv_3= 'activity' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleElevage1572); 

                        	newLeafNode(otherlv_3, grammarAccess.getElevageAccess().getActivityKeyword_3_0());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:685:1: ( ( ruleEString ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:686:1: ( ruleEString )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:686:1: ( ruleEString )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:687:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getElevageRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getElevageAccess().getActivityPeriodicActivityCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleElevage1595);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleElevage1609); 

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:712:1: entryRuleCulture returns [EObject current=null] : iv_ruleCulture= ruleCulture EOF ;
    public final EObject entryRuleCulture() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleCulture = null;


        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:713:2: (iv_ruleCulture= ruleCulture EOF )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:714:2: iv_ruleCulture= ruleCulture EOF
            {
             newCompositeNode(grammarAccess.getCultureRule()); 
            pushFollow(FollowSets000.FOLLOW_ruleCulture_in_entryRuleCulture1645);
            iv_ruleCulture=ruleCulture();

            state._fsp--;

             current =iv_ruleCulture; 
            match(input,EOF,FollowSets000.FOLLOW_EOF_in_entryRuleCulture1655); 

            }

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
    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:721:1: ruleCulture returns [EObject current=null] : ( () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' ) ;
    public final EObject ruleCulture() throws RecognitionException {
        EObject current = null;

        Token otherlv_1=null;
        Token otherlv_2=null;
        Token otherlv_3=null;
        Token otherlv_5=null;

         enterRule(); 
            
        try {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:724:28: ( ( () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' ) )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:725:1: ( () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' )
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:725:1: ( () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}' )
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:725:2: () otherlv_1= 'Culture' otherlv_2= '{' (otherlv_3= 'activity' ( ( ruleEString ) ) )? otherlv_5= '}'
            {
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:725:2: ()
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:726:5: 
            {

                    current = forceCreateModelElement(
                        grammarAccess.getCultureAccess().getCultureAction_0(),
                        current);
                

            }

            otherlv_1=(Token)match(input,35,FollowSets000.FOLLOW_35_in_ruleCulture1701); 

                	newLeafNode(otherlv_1, grammarAccess.getCultureAccess().getCultureKeyword_1());
                
            otherlv_2=(Token)match(input,12,FollowSets000.FOLLOW_12_in_ruleCulture1713); 

                	newLeafNode(otherlv_2, grammarAccess.getCultureAccess().getLeftCurlyBracketKeyword_2());
                
            // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:739:1: (otherlv_3= 'activity' ( ( ruleEString ) ) )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==32) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:739:3: otherlv_3= 'activity' ( ( ruleEString ) )
                    {
                    otherlv_3=(Token)match(input,32,FollowSets000.FOLLOW_32_in_ruleCulture1726); 

                        	newLeafNode(otherlv_3, grammarAccess.getCultureAccess().getActivityKeyword_3_0());
                        
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:743:1: ( ( ruleEString ) )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:744:1: ( ruleEString )
                    {
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:744:1: ( ruleEString )
                    // ../org.xtext.activity.act/src-gen/org/xtext/activity/parser/antlr/internal/InternalAct.g:745:3: ruleEString
                    {

                    			if (current==null) {
                    	            current = createModelElement(grammarAccess.getCultureRule());
                    	        }
                            
                     
                    	        newCompositeNode(grammarAccess.getCultureAccess().getActivityPeriodicActivityCrossReference_3_1_0()); 
                    	    
                    pushFollow(FollowSets000.FOLLOW_ruleEString_in_ruleCulture1749);
                    ruleEString();

                    state._fsp--;

                     
                    	        afterParserOrEnumRuleCall();
                    	    

                    }


                    }


                    }
                    break;

            }

            otherlv_5=(Token)match(input,26,FollowSets000.FOLLOW_26_in_ruleCulture1763); 

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
        public static final BitSet FOLLOW_15_in_rulePeriodicActivity226 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleDate_in_rulePeriodicActivity247 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_rulePeriodicActivity259 = new BitSet(new long[]{0x0000000000010000L});
        public static final BitSet FOLLOW_16_in_rulePeriodicActivity271 = new BitSet(new long[]{0x0000000008000000L});
        public static final BitSet FOLLOW_ruleDate_in_rulePeriodicActivity292 = new BitSet(new long[]{0x0000000000004000L});
        public static final BitSet FOLLOW_14_in_rulePeriodicActivity304 = new BitSet(new long[]{0x0000000006820000L});
        public static final BitSet FOLLOW_17_in_rulePeriodicActivity317 = new BitSet(new long[]{0x00000000007C0000L});
        public static final BitSet FOLLOW_18_in_rulePeriodicActivity330 = new BitSet(new long[]{0x0000000006800000L});
        public static final BitSet FOLLOW_19_in_rulePeriodicActivity348 = new BitSet(new long[]{0x0000000006800000L});
        public static final BitSet FOLLOW_20_in_rulePeriodicActivity366 = new BitSet(new long[]{0x0000000006800000L});
        public static final BitSet FOLLOW_21_in_rulePeriodicActivity384 = new BitSet(new long[]{0x0000000006800000L});
        public static final BitSet FOLLOW_22_in_rulePeriodicActivity402 = new BitSet(new long[]{0x0000000006800000L});
        public static final BitSet FOLLOW_23_in_rulePeriodicActivity418 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePeriodicActivity430 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleResAllocation_in_rulePeriodicActivity451 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_14_in_rulePeriodicActivity464 = new BitSet(new long[]{0x0000000010000000L});
        public static final BitSet FOLLOW_ruleResAllocation_in_rulePeriodicActivity485 = new BitSet(new long[]{0x0000000001004000L});
        public static final BitSet FOLLOW_24_in_rulePeriodicActivity499 = new BitSet(new long[]{0x0000000006000000L});
        public static final BitSet FOLLOW_25_in_rulePeriodicActivity514 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_rulePeriodicActivity526 = new BitSet(new long[]{0x0000000044004000L});
        public static final BitSet FOLLOW_ruleRule_in_rulePeriodicActivity547 = new BitSet(new long[]{0x0000000004004000L});
        public static final BitSet FOLLOW_14_in_rulePeriodicActivity560 = new BitSet(new long[]{0x0000000044004000L});
        public static final BitSet FOLLOW_ruleRule_in_rulePeriodicActivity581 = new BitSet(new long[]{0x0000000004004000L});
        public static final BitSet FOLLOW_26_in_rulePeriodicActivity595 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_rulePeriodicActivity609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleDate_in_entryRuleDate647 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleDate657 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_27_in_ruleDate703 = new BitSet(new long[]{0x0000000200000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleDate724 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleResAllocation_in_entryRuleResAllocation760 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleResAllocation770 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_28_in_ruleResAllocation816 = new BitSet(new long[]{0x0000000000000010L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleResAllocation836 = new BitSet(new long[]{0x0000000020000000L});
        public static final BitSet FOLLOW_29_in_ruleResAllocation848 = new BitSet(new long[]{0x0000000200000040L});
        public static final BitSet FOLLOW_ruleEInt_in_ruleResAllocation869 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEString_in_entryRuleEString906 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEString917 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_STRING_in_ruleEString957 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_RULE_ID_in_ruleEString983 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleRule_in_entryRuleRule1028 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleRule1038 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_30_in_ruleRule1085 = new BitSet(new long[]{0x0000000040000000L});
        public static final BitSet FOLLOW_rulePredicate_in_ruleRule1106 = new BitSet(new long[]{0x0000000040000002L});
        public static final BitSet FOLLOW_ruleAtelier_Impl_in_entryRuleAtelier_Impl1144 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleAtelier_Impl1154 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_31_in_ruleAtelier_Impl1200 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleAtelier_Impl1212 = new BitSet(new long[]{0x0000000104000000L});
        public static final BitSet FOLLOW_32_in_ruleAtelier_Impl1225 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleAtelier_Impl1248 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleAtelier_Impl1262 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleEInt_in_entryRuleEInt1299 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleEInt1310 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_33_in_ruleEInt1349 = new BitSet(new long[]{0x0000000000000040L});
        public static final BitSet FOLLOW_RULE_INT_in_ruleEInt1366 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_rulePredicate_in_entryRulePredicate1413 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRulePredicate1423 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleElevage_in_entryRuleElevage1491 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleElevage1501 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_34_in_ruleElevage1547 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleElevage1559 = new BitSet(new long[]{0x0000000104000000L});
        public static final BitSet FOLLOW_32_in_ruleElevage1572 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleElevage1595 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleElevage1609 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_ruleCulture_in_entryRuleCulture1645 = new BitSet(new long[]{0x0000000000000000L});
        public static final BitSet FOLLOW_EOF_in_entryRuleCulture1655 = new BitSet(new long[]{0x0000000000000002L});
        public static final BitSet FOLLOW_35_in_ruleCulture1701 = new BitSet(new long[]{0x0000000000001000L});
        public static final BitSet FOLLOW_12_in_ruleCulture1713 = new BitSet(new long[]{0x0000000104000000L});
        public static final BitSet FOLLOW_32_in_ruleCulture1726 = new BitSet(new long[]{0x0000000000000030L});
        public static final BitSet FOLLOW_ruleEString_in_ruleCulture1749 = new BitSet(new long[]{0x0000000004000000L});
        public static final BitSet FOLLOW_26_in_ruleCulture1763 = new BitSet(new long[]{0x0000000000000002L});
    }


}